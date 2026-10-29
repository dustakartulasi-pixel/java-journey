package LIBARATY_PROJECT;

import java.util.Scanner;

// ==========================================
// 1. BOOK CLASS
// ==========================================
class Book {
    int id;
    String title;
    String author;
    String category;
    boolean isAvailable;
    int currentBorrowerId;
    int totalIssueCount;

    // Constructor to initialize a new book
    public Book(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true;
        this.currentBorrowerId = -1; // -1 means no borrower
        this.totalIssueCount = 0;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public int getCurrentBorrowerId() {
        return currentBorrowerId;
    }

    public void setCurrentBorrowerId(int currentBorrowerId) {
        this.currentBorrowerId = currentBorrowerId;
    }

    public int getTotalIssueCount() {
        return totalIssueCount;
    }

    public void setTotalIssueCount(int totalIssueCount) {
        this.totalIssueCount = totalIssueCount;
    }

    // Methods to check availability and update borrower details
    public void issueTo(int memberId) {
        this.isAvailable = false;
        this.currentBorrowerId = memberId;
        this.totalIssueCount++;
    }

    public void returnBook() {
        this.isAvailable = true;
        this.currentBorrowerId = -1;
    }

    public void displayBook() {
        String status;
        if (isAvailable) {
            status = "Available";
        } else {
            status = "Borrowed by Member ID " + currentBorrowerId;
        }
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Category: " + category + ", Status: " + status +
                ", Total Issues: " + totalIssueCount);
    }
}

// ==========================================
// 2. MEMBER CLASS (ABSTRACT)
// ==========================================
abstract class Member {
    int memberId;
    String name;
    int currentBorrowedCount;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.currentBorrowedCount = 0;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getCurrentBorrowedCount() {
        return currentBorrowedCount;
    }

    public void incrementBorrowed() {
        currentBorrowedCount++;
    }

    public void decrementBorrowed() {
        if (currentBorrowedCount > 0) {
            currentBorrowedCount--;
        }
    }

    // Abstract methods to be implemented by subclasses
    public abstract int getBorrowingLimit();
    public abstract double calculateFine(int daysLate);
    public abstract String getMemberType();

    public void displayMember() {
        System.out.println("Member ID: " + memberId + ", Name: " + name +
                ", Type: " + getMemberType() +
                ", Borrowed: " + currentBorrowedCount + "/" + getBorrowingLimit());
    }
}

// ==========================================
// 3. STUDENT MEMBER CLASS
// ==========================================
class StudentMember extends Member {
    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    public int getBorrowingLimit() {
        return 3; // Student can borrow up to 3 books
    }

    public double calculateFine(int daysLate) {
        if (daysLate > 0) {
            return daysLate * 2.0; // 2 per day late
        }
        return 0.0;
    }

    public String getMemberType() {
        return "Student";
    }
}

// ==========================================
// 4. FACULTY MEMBER CLASS
// ==========================================
class FacultyMember extends Member {
    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    public int getBorrowingLimit() {
        return 10; // Faculty can borrow up to 10 books
    }

    public double calculateFine(int daysLate) {
        if (daysLate > 0) {
            return daysLate * 0.5; // 0.5 per day late
        }
        return 0.0;
    }

    public String getMemberType() {
        return "Faculty";
    }
}

// ==========================================
// 5. LIBRARY CLASS
// ==========================================
class Library {
    Book[] books = new Book[100];
    Member[] members = new Member[100];
    int bookCount = 0;
    int memberCount = 0;
    double totalFines = 0.0;

    // 1. Add Book: Check for duplicate IDs, handle book capacity
    public void addBook(Book book) {
        if (bookCount >= books.length) {
            System.out.println("Error: Library book capacity is full!");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == book.getId()) {
                System.out.println("Error: Book with ID " + book.getId() + " already exists!");
                return;
            }
        }
        books[bookCount] = book;
        bookCount++;
        System.out.println("Book '" + book.getTitle() + "' added successfully!");
    }

    // 2. Register Member: Check for duplicate IDs and member capacity
    public void registerMember(Member member) {
        if (memberCount >= members.length) {
            System.out.println("Error: Member capacity is full!");
            return;
        }
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == member.getMemberId()) {
                System.out.println("Error: Member with ID " + member.getMemberId() + " already exists!");
                return;
            }
        }
        members[memberCount] = member;
        memberCount++;
        System.out.println("Member '" + member.getName() + "' registered successfully!");
    }

    // 3. Display Books: Show all books with status
    public void displayBooks() {
        System.out.println("--- All Books in Library ---");
        if (bookCount == 0) {
            System.out.println("No books in library.");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBook();
        }
    }

    // 4. Search Books: Search for books by title or author
    public void searchBooks(String searchText) {
        System.out.println("--- Search Results for: " + searchText + " ---");
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().toLowerCase().contains(searchText.toLowerCase()) ||
                books[i].getAuthor().toLowerCase().contains(searchText.toLowerCase())) {
                books[i].displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    // 5. Issue Book: Validate member and book availability, check borrowing limits
    public void issueBook(int bookId, int memberId) {
        // Find Book
        Book book = null;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == bookId) {
                book = books[i];
                break;
            }
        }
        if (book == null) {
            System.out.println("Error: Book not found!");
            return;
        }

        // Find Member
        Member member = null;
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == memberId) {
                member = members[i];
                break;
            }
        }
        if (member == null) {
            System.out.println("Error: Member not found!");
            return;
        }

        // Check availability
        if (!book.isAvailable()) {
            System.out.println("Error: Book is already borrowed by Member ID " + book.getCurrentBorrowerId() + "!");
            return;
        }

        // Check borrowing limit
        if (member.getCurrentBorrowedCount() >= member.getBorrowingLimit()) {
            System.out.println("Error: Member has reached borrowing limit of " + member.getBorrowingLimit() + " books!");
            return;
        }

        // Issue book
        book.issueTo(memberId);
        member.incrementBorrowed();
        System.out.println("Success: Book '" + book.getTitle() + "' issued to " + member.getName() + "!");
    }

    // 6. Return Book: Validate current borrower, calculate fines, update availability
    public void returnBook(int bookId, int memberId, int daysLate) {
        // Find Book
        Book book = null;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == bookId) {
                book = books[i];
                break;
            }
        }
        if (book == null) {
            System.out.println("Error: Book not found!");
            return;
        }

        // Find Member
        Member member = null;
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == memberId) {
                member = members[i];
                break;
            }
        }
        if (member == null) {
            System.out.println("Error: Member not found!");
            return;
        }

        // Validate current borrower
        if (book.isAvailable() || book.getCurrentBorrowerId() != memberId) {
            System.out.println("Error: This book was not borrowed by Member ID " + memberId + "!");
            return;
        }

        // Calculate fine
        double fine = member.calculateFine(daysLate);
        totalFines = totalFines + fine;

        // Return book
        book.returnBook();
        member.decrementBorrowed();

        System.out.println("Success: Book returned successfully!");
        if (fine > 0) {
            System.out.println("Days late: " + daysLate + ". Fine amount: " + fine);
        } else {
            System.out.println("No fine charged.");
        }
    }

    // 7. Show Available Books: List books that are not currently borrowed
    public void showAvailableBooks() {
        System.out.println("--- Available Books ---");
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books.");
        }
    }

    // 8. Show Member Borrowings: Display borrowing status for a member
    public void showMemberBorrowings(int memberId) {
        Member member = null;
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == memberId) {
                member = members[i];
                break;
            }
        }
        if (member == null) {
            System.out.println("Error: Member not found!");
            return;
        }

        System.out.println("--- Books Borrowed by " + member.getName() + " (ID: " + memberId + ") ---");
        boolean hasBooks = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getCurrentBorrowerId() == memberId) {
                books[i].displayBook();
                hasBooks = true;
            }
        }
        if (!hasBooks) {
            System.out.println("No books currently borrowed.");
        }
    }

    // 9. Library Report: Summarize statistics and identify the most frequently issued book
    public void libraryReport() {
        System.out.println("--- Library Report ---");
        System.out.println("Total Registered Books: " + bookCount);
        System.out.println("Total Registered Members: " + memberCount);
        System.out.println("Total Fines Collected: " + totalFines);

        // Find most frequently issued book
        Book mostIssued = null;
        int maxIssues = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTotalIssueCount() > maxIssues) {
                maxIssues = books[i].getTotalIssueCount();
                mostIssued = books[i];
            }
        }

        if (mostIssued != null) {
            System.out.println("Most Frequently Issued Book: " + mostIssued.getTitle() +
                    " (Issued " + maxIssues + " times)");
        } else {
            System.out.println("Most Frequently Issued Book: None (No books have been issued yet)");
        }
    }

    public void displayMembers() {
        System.out.println("--- Registered Members ---");
        if (memberCount == 0) {
            System.out.println("No members registered.");
            return;
        }
        for (int i = 0; i < memberCount; i++) {
            members[i].displayMember();
        }
    }
}

// ==========================================
// 6. MAIN CLASS (CONSOLE MENU)
// ==========================================
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Books");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Show Available Books");
            System.out.println("8. Show Member Borrowings");
            System.out.println("9. Library Report");
            System.out.println("10. Display All Members");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear input line

            if (choice == 1) {
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();
                System.out.print("Enter Category: ");
                String category = sc.nextLine();

                Book book = new Book(id, title, author, category);
                library.addBook(book);

            } else if (choice == 2) {
                System.out.print("Enter Member ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Member Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Member Type (1 for Student, 2 for Faculty): ");
                int type = sc.nextInt();
                sc.nextLine();

                if (type == 1) {
                    library.registerMember(new StudentMember(id, name));
                } else if (type == 2) {
                    library.registerMember(new FacultyMember(id, name));
                } else {
                    System.out.println("Invalid member type!");
                }

            } else if (choice == 3) {
                library.displayBooks();

            } else if (choice == 4) {
                System.out.print("Enter search text (Title or Author): ");
                String text = sc.nextLine();
                library.searchBooks(text);

            } else if (choice == 5) {
                System.out.print("Enter Book ID to issue: ");
                int bookId = sc.nextInt();
                System.out.print("Enter Member ID: ");
                int memberId = sc.nextInt();
                sc.nextLine();
                library.issueBook(bookId, memberId);

            } else if (choice == 6) {
                System.out.print("Enter Book ID to return: ");
                int bookId = sc.nextInt();
                System.out.print("Enter Member ID: ");
                int memberId = sc.nextInt();
                System.out.print("Enter Days Late (0 if returned on time): ");
                int daysLate = sc.nextInt();
                sc.nextLine();
                library.returnBook(bookId, memberId, daysLate);

            } else if (choice == 7) {
                library.showAvailableBooks();

            } else if (choice == 8) {
                System.out.print("Enter Member ID: ");
                int memberId = sc.nextInt();
                sc.nextLine();
                library.showMemberBorrowings(memberId);

            } else if (choice == 9) {
                library.libraryReport();

            } else if (choice == 10) {
                library.displayMembers();

            } else if (choice == 0) {
                System.out.println("Exiting system. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
