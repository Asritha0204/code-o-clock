package Basic;
import java.util.Scanner;

public class StudentDetails{
    int registerNo;
    String name;
    String branch;
    Scanner sc=new Scanner(System.in);
    void getData(){
        System.out.println("Enter Register Number");
        registerNo=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Branch");
        branch=sc.next();
    }
    void printData(){
        System.out.println("Register Number: "+registerNo);
        System.out.println("Name: "+name);
        System.out.println("Branch: "+branch);
    }
    public static void main(String[] args) {
        StudentDetails s=new StudentDetails();
        s.getData();
        s.printData();
    }
}
