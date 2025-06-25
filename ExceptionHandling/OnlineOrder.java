package ExceptionHandling;

import java.util.Scanner;

public class OnlineOrder {
    String P_name;
    int P_Qty;
    float P_price;
    Scanner sc=new Scanner(System.in);    
    void getData() throws QuantityExceptionHandler{
        System.out.println("Enter the Product Name:");
        P_name=sc.next();
        System.out.println("Enter the Product Quantity:");
        P_Qty=sc.nextInt();
        System.out.println("Enter the Product Price:");
        P_price=sc.nextFloat();
        if(P_Qty>=6){
            throw new QuantityExceptionHandler("Order quantity should be less than 6");
        }
    }
    void printData(){
        System.out.println("Product Name:"+P_name);
        System.out.println("Product Quantity:"+P_Qty);
        System.out.println("Product Price:"+P_price);
        System.out.println("Total Price:"+P_price*P_Qty);
    }
    public static void main(String[] args) {
        OnlineOrder o=new OnlineOrder();
        try{
            o.getData();
        }
        catch(QuantityExceptionHandler e){
            System.out.println(e);
        }
        o.printData();
    }


}
