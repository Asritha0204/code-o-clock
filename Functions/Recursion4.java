//find the summation of arrays using recursion

package Functions;

import java.util.Scanner;

public class Recursion4 {
    public void fun(int arr[],int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        fun(arr,n-1,sum+arr[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Recursion4 obj=new Recursion4();
        obj.fun(arr,n,0);
    }
}
