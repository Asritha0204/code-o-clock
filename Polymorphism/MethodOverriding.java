package Polymorphism;

class parentClass{
    void printData(String name){
        System.out.println("Your name is "+name);
    }
}

public class MethodOverriding extends parentClass {
    @Override
    void printData(String address){
        System.out.println("Your Address is "+address);
    }
    public static void main(String[] args) {
        parentClass p=new parentClass();
        p.printData("Naina");
        MethodOverriding m=new MethodOverriding();
        m.printData("Kashmir");
    }
    
}
