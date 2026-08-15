// Tech2AI Focus Timer State Management
let timerInterval = null;
let totalSeconds = 25 * 60;
let remainingSeconds = totalSeconds;
let isRunning = false;
let completedCount = 0;
let currentMode = 'focus';

// DOM Elements
const timerDisplay = document.getElementById('timer');
const sessionStatus = document.getElementById('sessionStatus');
const message = document.getElementById('message');
const startBtn = document.getElementById('startBtn');
const pauseBtn = document.getElementById('pauseBtn');
const resetBtn = document.getElementById('resetBtn');
const modeBtns = document.querySelectorAll('.mode-btn');
const progressRing = document.getElementById('progressRing');
const completedSessionsDisplay = document.getElementById('completedSessions');

// Circle calculation for progress ring
const CIRCUMFERENCE = 2 * Math.PI * 120; // radius = 120
if (progressRing) {
    progressRing.style.strokeDasharray = `${CIRCUMFERENCE} ${CIRCUMFERENCE}`;
    progressRing.style.strokeDashoffset = 0;
}

function setProgress(percent) {
    if (!progressRing) return;
    const offset = CIRCUMFERENCE - (percent / 100) * CIRCUMFERENCE;
    progressRing.style.strokeDashoffset = offset;
}

function formatTime(seconds) {
    const mins = Math.floor(seconds / 60).toString().padStart(2, '0');
    const secs = (seconds % 60).toString().padStart(2, '0');
    return `${mins}:${secs}`;
}

function updateDisplay() {
    timerDisplay.textContent = formatTime(remainingSeconds);
    const percent = ((totalSeconds - remainingSeconds) / totalSeconds) * 100;
    setProgress(percent);
    document.title = `${formatTime(remainingSeconds)} - Tech2AI Focus Timer`;
}

function startTimer() {
    if (isRunning) return;
    isRunning = true;

    startBtn.disabled = true;
    pauseBtn.disabled = false;

    timerInterval = setInterval(() => {
        if (remainingSeconds > 0) {
            remainingSeconds--;
            updateDisplay();
        } else {
            clearInterval(timerInterval);
            timerInterval = null;
            isRunning = false;
            startBtn.disabled = false;
            pauseBtn.disabled = true;

            if (currentMode === 'focus') {
                completedCount++;
                completedSessionsDisplay.textContent = completedCount;
                playAlarm();
                alert('🎉 Focus session completed! Time for a break.');
            } else {
                playAlarm();
                alert('⏰ Break time is over! Ready to focus again?');
            }
        }
    }, 1000);
}

function pauseTimer() {
    if (!isRunning) return;
    clearInterval(timerInterval);
    timerInterval = null;
    isRunning = false;

    startBtn.disabled = false;
    pauseBtn.disabled = true;
}

function resetTimer() {
    pauseTimer();
    remainingSeconds = totalSeconds;
    updateDisplay();
}

function switchMode(minutes, mode, button) {
    pauseTimer();
    currentMode = mode;
    totalSeconds = minutes * 60;
    remainingSeconds = totalSeconds;

    modeBtns.forEach(btn => btn.classList.remove('active'));
    button.classList.add('active');

    if (mode === 'focus') {
        sessionStatus.textContent = 'FOCUS SESSION';
        message.textContent = 'Keep coding, stay focused!';
        updateGradient('#6366f1', '#a855f7');
    } else if (mode === 'short') {
        sessionStatus.textContent = 'SHORT BREAK';
        message.textContent = 'Take a breather and stretch!';
        updateGradient('#10b981', '#059669');
    } else if (mode === 'long') {
        sessionStatus.textContent = 'LONG BREAK';
        message.textContent = 'Relax, grab a drink or walk around.';
        updateGradient('#3b82f6', '#1d4ed8');
    }

    updateDisplay();
}

function updateGradient(color1, color2) {
    const stop1 = document.querySelector('#gradient stop:nth-child(1)');
    const stop2 = document.querySelector('#gradient stop:nth-child(2)');
    if (stop1 && stop2) {
        stop1.setAttribute('stop-color', color1);
        stop2.setAttribute('stop-color', color2);
    }
}

function playAlarm() {
    try {
        const audioCtx = new (window.AudioContext || window.webkitAudioContext)();
        const osc = audioCtx.createOscillator();
        const gain = audioCtx.createGain();
        osc.type = 'sine';
        osc.frequency.setValueAtTime(587.33, audioCtx.currentTime);
        gain.gain.setValueAtTime(0.1, audioCtx.currentTime);
        osc.connect(gain);
        gain.connect(audioCtx.destination);
        osc.start();
        osc.stop(audioCtx.currentTime + 0.5);
    } catch (e) {
        console.log('Audio notification fallback:', e);
    }
}

// Event Listeners
startBtn.addEventListener('click', startTimer);
pauseBtn.addEventListener('click', pauseTimer);
resetBtn.addEventListener('click', resetTimer);

modeBtns.forEach(btn => {
    btn.addEventListener('click', (e) => {
        const time = parseInt(e.target.getAttribute('data-time'), 10);
        const mode = e.target.getAttribute('data-mode');
        switchMode(time, mode, e.target);
    });
});

// Initialize
updateDisplay();