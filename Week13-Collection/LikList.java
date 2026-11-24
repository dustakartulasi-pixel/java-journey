//package Week13-Collection;
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class LikList {
    public static void main(String[] args) {
        ListNode first = new ListNode(10);
        ListNode secound = new ListNode(20);
        ListNode third = new ListNode(30);
        // Linking nodes
        first.next = secound;
        secound.next = third;
        // head
        ListNode head = first;
        ListNode current = head;
        // fetch the values
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }

}
