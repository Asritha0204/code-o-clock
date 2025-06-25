// check whether a number is prime or not
import java.util.Scanner;

public class primeNum {
    public void Prime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }
    public static void main(String[] args) {
        primeNum p=new primeNum();
        p.Prime();
    }
}
