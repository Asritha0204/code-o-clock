package Basic;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Text ");
        String name=s.next();
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if(name.equals(reverse)){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Given String is not Palindrome");
        }
        s.close();
    }
}
