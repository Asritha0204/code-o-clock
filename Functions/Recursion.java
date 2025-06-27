package Functions;

public class Recursion {
    public void fun(int n){
        if(n<=0){
            return ;
        }
        while(n<=5){
            System.out.print(n+" ");
            n++;
        }
    }
    public static void main(String[] args){
        Recursion r=new Recursion();
        r.fun(1);
    }
}
