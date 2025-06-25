package DataEncapsulation;

import java.util.Scanner;

public class PrintInfo {
    Scanner sc = new Scanner(System.in);
    Registration r = new Registration();
    void getData(){
        System.out.println("Enter the Register Number");
        r.setRegisterNo(sc.nextInt());
        System.out.println("Enter the Username");
        r.setUserName(sc.next());
    }
    void printData(){
        System.out.println("Register Number: "+r.getRegisterNo());
        System.out.println("Username: "+r.getUserName());
    }
    public static void main(String[] args) {
        PrintInfo p = new PrintInfo();
        p.getData();
        p.printData();
    }
                        
}
