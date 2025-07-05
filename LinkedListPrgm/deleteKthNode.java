package LinkedListPrgm;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class deleteKthNode {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void deleteKthFromEnd(int k){
        Node dummy = new Node(0); 
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        for(int i = 0; i <= k; i++){
            if(first == null) return; 
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        if(second.next != null)
            second.next = second.next.next;
        head = dummy.next; 
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        deleteKthNode obj = new deleteKthNode();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        System.out.println("Original List:");
        obj.display();
        int k = 2;
        obj.deleteKthFromEnd(k);
        System.out.println("\nAfter deleting " + k + "th node from end:");
        obj.display();
    }
}
