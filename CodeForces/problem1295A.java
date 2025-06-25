
package CodeForces;

import java.util.*;

public class problem1295A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder("");
            if(n%2==1){
                sb.append('7');
                n-=3;
            }
            while(n>0){
                sb.append('1');
                n-=2;
            }
            System.out.println(sb.toString());

        }
        
    }
}
