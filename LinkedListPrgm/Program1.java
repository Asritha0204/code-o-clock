package LinkedListPrgm;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Program1 {
    Node head;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void inserAtFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtPosition(int data,int pos){
        if(pos<0){
            System.out.println("Invalid position");
        }
        else if(pos==0){
            inserAtFirst(data);
        }
        else{
            Node newNode=new Node(data);
            Node current=head;
            for(int i=0;i<pos-1;i++){
                current=current.next;
            }
            if(current==null){
                System.out.println("Invalid position");
                return;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
        }
    }
    public void deleteAtPosition(int pos){
        if(pos<0){
            System.out.println("Invalid position");
        }
        else if(pos==0){
            head=head.next;
        }
        else{
            Node current=head;
            for(int i=0;i<pos-1;i++){
                current=current.next;
            }
            if(current==null){
                System.out.println("Invalid position");
                return;
            }
            if(current.next==null){
                System.out.println("Invalid position");
                return;
            }
            else{
                current.next=current.next.next;
            }
        }
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node current=head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
    }
    public void search(int data){
        Node current=head;
        while(current!=null){
            if(current.data==data){
                System.out.println("Element found ");
                return;
            }
            current=current.next;
        }
        System.out.println("Element not found");
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print("["+current.data+"]"+"  -> ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Program1 list=new Program1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            list.add(data);
        }
        list.display();
        list.insertAtPosition(10,2);
        list.display();
        list.inserAtFirst(5);
        list.display();
        list.inserAtFirst(3);
        list.display();
        list.deleteAtPosition(2);
        list.display();
        list.search(10);
        sc.close();
    }
}
