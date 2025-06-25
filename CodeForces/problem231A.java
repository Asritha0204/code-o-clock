//www.codeforces.com/contest/231/problem/A

package CodeForces;

import java.util.Scanner;

public class problem231A {
    void problems(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int x,y,z;
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            if(x+y+z>=2){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    public static void main(String[] args) {
        problem231A obj=new problem231A();
        obj.problems();
    }
}
