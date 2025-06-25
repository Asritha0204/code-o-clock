package Interface_LooselyCoupled;

import java.util.Scanner;

public class StudentInfo implements InformationProvider {
    int registerNo;
    String name;
    float fees;
    Scanner sc=new Scanner(System.in);
    public void getData() {
        System.out.println("Enter the Register Number:");
        registerNo=sc.nextInt();
        System.out.println("Enter the Name:");
        name=sc.next();
        System.out.println("Enter the Fees:");
        fees=sc.nextFloat();
    }
    public void printData() {
        System.out.println("Register Number: "+registerNo);
        System.out.println("Name: "+name);
        System.out.println("Fees: "+fees);
    }
}
