package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String name=s.next();
        s.close();
        StringBuffer sb=new StringBuffer(name);
        sb.reverse();
        String reverse=sb.toString();
        if(name.equalsIgnoreCase(reverse)){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Not Plaindrome");
        }
    }
}
