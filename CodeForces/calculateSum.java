//given a number N, your task is to calculate and print the sum of the table of N

package CodeForces;
import java.util.*;
public class calculateSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=n*i;
        }
        System.out.println(sum);
        sc.close();
    }
}
