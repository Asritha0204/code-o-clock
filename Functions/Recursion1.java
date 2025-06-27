//program to print digits of a number using recursion

package Functions;

import java.util.Scanner;

public class Recursion1 {
    public void fun(int n){
        if(n==0){
            return;
        }
        fun(n/10);
        System.out.print(Math.abs(n%10)+" ");
    }
    public static void main(String args[]){
        Recursion1 r=new Recursion1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        r.fun(n);
        sc.close();
    }
}
