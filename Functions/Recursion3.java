//print all the array elements using recursion

package Functions;

import java.util.Scanner;

public class Recursion3 {
    public void fun(int arr[],int n){
        if(n==0){
            return;
        }
        fun(arr,n-1);
        System.out.print(arr[n-1]+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        sc.close();
        Recursion3 obj=new Recursion3();
        obj.fun(arr,n);
    }
}

