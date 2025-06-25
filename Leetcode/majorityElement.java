/*Leetcode: 169. 
find the majority element in the array of size n using hashmap
*/
package Leetcode;

import java.util.*;

public class majorityElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count=0,ele=0,max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ele=arr[i];
            }
            count=0;
        }
        System.out.println(ele);
        sc.close();
    }
}
