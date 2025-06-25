package Basic;
import java.util.Scanner;

class PersonalRecords {
    String name;
    String fatherName;
    String motherName;

    // Default constructor
    PersonalRecords() {
        name = "Arya";
        fatherName = "Surya";
        motherName = "Mithra";
    }

    // Parameterized constructor
    PersonalRecords(String name, String fatherName, String motherName) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    void getData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name:");
        name = s.next();
        System.out.println("Enter the Father Name:");
        fatherName = s.next();
        System.out.println("Enter the Mother Name:");
        motherName = s.next();
        // Do not close the Scanner here to avoid closing System.in
        s.close();
    }

    void printData() {
        System.out.println("My Name is " + name);
        System.out.println("My Father Name is " + fatherName);
        System.out.println("My Mother Name is " + motherName);
    }
}

public class StudentDetail extends PersonalRecords {
    float tenthPercentage;

    // Default constructor
    StudentDetail() {
        tenthPercentage = 80.5f;
    }

    // Parameterized constructor
    StudentDetail(float tenth, float twelth, float ug, float pg) {
        this.tenthPercentage = tenth;
    }

    // Overriding getData
    void getStudentDetails() {
        Scanner s = new Scanner(System.in);

        // Getting personal details
        System.out.println("Enter the Name:");
        name = s.next();
        System.out.println("Enter the Father Name:");
        fatherName = s.next();
        System.out.println("Enter the Mother Name:");
        motherName = s.next();

        // Getting academic details
        System.out.println("Enter the Tenth Percentage:");
        tenthPercentage = s.nextFloat();
        // Do not close the scanner to avoid issues with System.in
        s.close();
    }

    // Overriding printData
    void printStudentDetails() {
        System.out.println("My Name is " + name);
        System.out.println("My Father Name is " + fatherName);
        System.out.println("My Mother Name is " + motherName);
        System.out.println("My Tenth Percentage is " + tenthPercentage);

    }

    public static void main(String[] args) {
        StudentDetail s1 = new StudentDetail();
        s1.getData();
        s1.printData();

        System.out.println("\n--- Another Student ---");
        StudentDetail s2 = new StudentDetail();
        s2.getStudentDetails();
        s2.printStudentDetails();
    }
}
