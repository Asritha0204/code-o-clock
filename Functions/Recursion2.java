//Check a number is palindrome or not using recursion

package Functions;

public class Recursion2 {
    static boolean isPalindrome(int num){
        int reverse=0;
        int temp=Math.abs(num);
        while (temp!=0) {
            reverse=(reverse*10)+(temp%10);
            temp=temp/10;
        }
        return (reverse==Math.abs(num));
    }

    public static void main(String[] args) {
        int n=1203321;
        System.out.println(isPalindrome(n)?"Yes":"No");
    }
}

