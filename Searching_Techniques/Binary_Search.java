package Searching_Techniques;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int unpaired=0,n=arr.length;
        int mid=n/2,left=0,right=n-1;
        while(true){
            if(mid+1<=right && arr[mid+1]==arr[mid]){
                left=mid;
                mid+=Math.ceilDiv((right-mid), right);
            }
            else if(mid-1>=left && arr[mid-1]==arr[mid]){
                right=mid-1;
                mid+=Math.ceilDiv((right-mid), right);
            }
            else{
                unpaired=arr[mid];
                break;
            }
        }
        System.out.println(unpaired);
        sc.close();
    }
}
               


