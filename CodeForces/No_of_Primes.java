package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_of_Primes {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
        int count=0;
        for(int i=0;i<primes.size();i++){
           for(int j=i+1;j<primes.size();j++){
               if(primes.get(i)+primes.get(j)==n){
                   count++;
               }
           }
        }
        System.out.println(count);
        sc.close();    
    }
}
