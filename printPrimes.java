//Print n no of prime numbers using function
import java.util.Scanner;

public class printPrimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to be printed : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
