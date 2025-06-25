//substring(int beginIndex, int endIndex) method and substring(beginIndex) method

package Strings;

public class method1 {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String Substr=anotherPalindrome.substring(11,15);
        System.out.println(Substr);
        String Substr1=anotherPalindrome.substring(11);
        System.out.println(Substr1);
    }
}
