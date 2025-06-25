package Polymorphism;

public class MethodOverloading {
    void getInfo(){
        System.out.println("Welcome to Method Overloading");
    }
    String getInfo(String name){
        return "Hi! Welcome to Method Overloading "+name;
    }
    String getInfo(String name,String address){
        return "Hi! Welcome to Method Overloading "+name+" from "+address;
    }
    String getInfo(int pincode){
        return "Your pincode is "+pincode;
    }
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.getInfo();
        System.out.println(mo.getInfo("Naina"));
        System.out.println(mo.getInfo("Naina","Kashmir"));
        System.out.println(mo.getInfo(123456));
    }
}
