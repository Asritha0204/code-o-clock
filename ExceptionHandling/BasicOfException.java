package ExceptionHandling;

import java.util.Scanner;

public class BasicOfException {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    void readandeval(){
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("The output of a/b is "+c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Thankyou");
    }
    public static void main(String[] args) {
        BasicOfException obj=new BasicOfException();
        obj.readandeval();

    }
}
