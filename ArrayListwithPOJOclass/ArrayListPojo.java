package ArrayListwithPOJOclass;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPojo {
    Scanner sc = new Scanner(System.in);
    Studentinfo s1=new Studentinfo();
    ArrayList<Studentinfo> s_info = new ArrayList<Studentinfo>();
    void readData() {
        for (int i = 0; i < 3; i++) {
            s1 = new Studentinfo();
            System.out.println("Enter the Name:");
            s1.setName(sc.next());
            System.out.println("Enter the Register Number:");
            s1.setRegisterNo(sc.nextInt());
            System.out.println("Enter the Fees:");
            s1.setFees(sc.nextFloat());
            s_info.add(s1);
        }
    }

    void printData() {
        for (Studentinfo s : s_info) {
            System.out.println("Register Number: " + s.getRegisterNo());
            System.out.println("Name: " + s.getName());
            System.out.println("Fees: " + s.getFees());
        }
    }
    public static void main(String[] args) {
        ArrayListPojo a = new ArrayListPojo();
        a.readData();
        a.printData();
    }
}
