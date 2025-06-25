//print the string after eliminating all spaces

package Strings;

import java.util.Scanner;

public class removeSpaces {
   
    /* 
        public static void main(String[] args){
            String str="Hello World! I'm Naina greeting to you from Kashmir";
            System.out.println(str.replace(" ","").toLowerCase());
        }
    */
   
   
    /*  public static void main(String[] args) {
            StringBuffer sb = new StringBuffer();
            System.out.println("Enter the string: ");
            sb.append(System.console().readLine());
            System.out.println(sb.toString().replace(" ", "").toLowerCase());
        }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data=sc.nextLine();
        sc.close();
        StringBuffer sb = new StringBuffer(data);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                sb.deleteCharAt(i);
                
            }
        }
        System.out.println(sb.toString().toLowerCase());
    }
}
