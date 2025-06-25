/*
    Manipulating Strings
    split(String regex)
    split(String regex, int limit)
    subSequence(int beginIndex, int endIndex)
    trim()
    toLowerCase()
    toUpperCase()
    replace(char oldChar, char newChar)
*/
package Strings;

public class method2 {
    public static void main(String args[]) {
        String str = "      Hello World";
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('H', 'h'));
    }
}
