//given an array of integers, arr, and an integer k, find and printmaximum number in each contiguous window of size k
package CodeForces;

import java.util.*;

public class maxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        for(int i=0;i<arr.length-k+1;i++){
            int max=arr[i];
            for(int j=i+1;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.print(max+" ");
        }
        sc.close();
    }
}
