/*Leetcode:229 
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2] */
package Leetcode;

import java.util.*;

public class majorityElement1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();  
        int count1=0,count2=0,majority1=0,majority2=0;
        for(int num:arr){
            if(num==majority1){
                count1++;  
            } 
            else if(num==majority2){
                count2++;  
            } 
            else if(count1==0){
                majority1=num;
                count1=1;  
            } 
            else if(count2==0){
                majority2=num;
                count2=1;  
            } 
            else{
                count1--;  
                count2--;  
            }
        }  
        count1=0;
        count2=0;
        for(int num:arr){
            if(num==majority1){
                count1++;  
            } 
            else if(num==majority2){
                count2++;  
            } 
        }  
        if(count1>arr.length/3){
            System.out.println(majority1);  
        } 
        if(count2>arr.length/3){
            System.out.println(majority2);  
        } 
        sc.close();
    }
}
