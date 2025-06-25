package Basic;
import java.util.Scanner;

public class SDwithReturnKeyword{
    int registerNo;
    String name;
    int marks[]=new int[6];
    int total;
    float percentage;
    Scanner sc=new Scanner(System.in);
    void getData(){
        System.out.println("Enter Register Number");
        registerNo=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        for(int i=0;i<6;i++){
            System.out.println("Enter Marks of Subject "+(i+1));
            marks[i]=sc.nextInt();
        }
    }
    float percentageCalculator(){
        for(int i=0;i<6;i++){
            total+=marks[i];
        }
        percentage=(float)total/marks.length;
        return percentage;
    }
    void printData(){
        System.out.println("Register Number: "+registerNo);
        System.out.println("Name: "+name);
        for(int i=0;i<6;i++){
            System.out.println("Marks of Subject "+(i+1)+": "+marks[i]);
        }
        System.out.println("Percentage: "+percentageCalculator());
        System.out.println("Total: "+total);
    }
    public static void main(String[] args) {
        SDwithReturnKeyword s=new SDwithReturnKeyword();
        s.getData();
        s.printData();
    }
}