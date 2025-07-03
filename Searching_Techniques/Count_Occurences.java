package Searching_Techniques;

import java.util.*;

public class Count_Occurences {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
