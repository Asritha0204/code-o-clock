//the chocolate packs here represents an array of n no.of integer values. The task is to find the number of empty packs in the array and push it to the end of the array.

package CodeForces;

import java.util.Scanner;

public class emptyPacks {
    void Packs() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0; 
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<n){
            arr[index++]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void main(String[] args) {
        emptyPacks obj=new emptyPacks();
        obj.Packs();
    }
}
