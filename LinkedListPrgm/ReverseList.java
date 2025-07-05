//Reverse a Linked List

package LinkedListPrgm;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseList {
    public static Node reverse(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head=reverse(head);
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }
}
