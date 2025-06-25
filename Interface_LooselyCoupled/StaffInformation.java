package Interface_LooselyCoupled;

import java.util.Scanner;

public class StaffInformation implements InformationProvider {
    int staffId;
    String staffName;
    float salary;
    Scanner sc=new Scanner(System.in);
    public void getData() {
        System.out.println("Enter Staff Id:");
        staffId=sc.nextInt();
        System.out.println("Enter Staff Name:");
        staffName=sc.next();
        System.out.println("Enter Staff Salary:");
        salary=sc.nextFloat();
    }   
    public void printData() {
        System.out.println("Staff Id: "+staffId);
        System.out.println("Staff Name: "+staffName);
        System.out.println("Staff Salary: "+salary*12);
    }
}
