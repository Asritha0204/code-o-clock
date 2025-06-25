package ExceptionHandling;

import java.util.Scanner;

public class finallyBlock {
    int marks[]=new int[6];
    Scanner sc=new Scanner(System.in);
    void readData(){
        try{
            for(int i=0;i<=6;i++){
                marks[i]=sc.nextInt();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{//Finally block get executed at any cost if error occurs or not
            System.out.println("Finally Block");
        }
    }
    void printData() {
        try{
            for(int i=0;i<=6;i++){
                System.out.println(marks[i]);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Block");
        }
    }
    public static void main(String[] args) {
        finallyBlock obj=new finallyBlock();
        try{
            obj.readData();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            obj.printData();
        }
    }
}
