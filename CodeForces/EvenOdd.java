/*Write a program to arrange all your 
  i. even numbers in even index
  ii. odd numbers in odd index
*/


package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    void print(){
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sc.close();
        int n=arr.length;

        int eCount=0, oCount=0, o=1,e=0 ;
        for(int num:arr){
            eCount+=num%2==0?1:0;
            oCount=n-eCount;
        }
        int result[]=new int[(eCount>oCount)?eCount*2-1:oCount*2];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                result[e]=arr[i];
                e+=2;
            } 
            else{
                result[o]=arr[i];
                o+=2;
            }
        }
        for(;o<result.length;o+=2){
            result[o]=1;
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
    
    public static void main(String[] args) {
        EvenOdd obj=new EvenOdd();
        obj.print();
    }
}
















// package CodeForces;

// import java.util.Arrays;
// import java.util.Scanner;

// public class EvenOdd {
//     void print(){
//         Scanner sc=new Scanner(System.in);
//         int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//         int n=arr.length;
//         int result[]=new int[n];
//         int even=0, odd=1;
//         for(int i=0;i<n;i++){
//             if(arr[i]%2==0 && even<n){
//                 result[even]=arr[i];
//                 even+=2;
//             } 
//             else if(arr[i]%2!=0 && odd<n){
//                 result[odd]=arr[i];
//                 odd+=2;
//             }
//         }
//         System.out.println("Array after arranging:");
//         for (int i=0; i<n;i++) {
//             System.out.print(result[i]+" ");
//         }
//         sc.close();
//     }
//     public static void main(String[] args) {
//         EvenOdd obj=new EvenOdd();
//         obj.print();
//     }
// }





