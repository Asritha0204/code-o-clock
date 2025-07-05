// Mid-point in a Linked List using counting method

package LinkedListPrgm;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < count / 2; i++) {
            current = current.next;
        }
        System.out.println("Middle Node: " + current.data);
    }
}
