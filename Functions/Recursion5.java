//check string is a palindrome or not 

package Functions;

public class Recursion5 {
    public void fun(String name){
        if(name.length()==0){
            return;
        }
        StringBuffer res=new StringBuffer(name).reverse();
        if(name.equalsIgnoreCase(res.toString())){
                System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Given String is not Palindrome");
        }
    }
    public static void main(String[] args) {
        Recursion5 obj=new Recursion5();
        obj.fun("Malayalam");
    }
}
