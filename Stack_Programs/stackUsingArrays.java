//Stack using Arrays

package Stack_Programs;
import java.util.*;
public class stackUsingArrays {
    int top;
    int size;
    int[] arr;
    stackUsingArrays(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
        }
        else{
            arr[++top]=data;
        }
    }
    public void pop(int data){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            arr[top--]=data;
        }
    }
    public void display(){
        System.out.println("\nElements in the stack are: ");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        sc.close();
        stackUsingArrays obj=new stackUsingArrays(5);
        obj.push(10);
        obj.push(12);
        obj.push(14);
        obj.push(16);
        obj.push(18);
        obj.display();
        obj.pop(16);
        obj.display();

    }
}
