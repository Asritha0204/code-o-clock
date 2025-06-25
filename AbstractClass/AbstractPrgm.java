package AbstractClass;

abstract class abstractclass {  //object creation is not possible in abstract class
    abstractclass(){
        System.out.println("This is abstract class");
    }
    abstract void printInfo();
    void getInfo(){
        System.out.println("This is non abstract method");
    }
}
public class AbstractPrgm extends abstractclass{
    AbstractPrgm(){
        System.out.println("This is child class constructor");
    }
    @Override
    void printInfo(){
        System.out.println("I'm an abstract method but define in child class");
    }
    public static void main(String[] args) {
        abstractclass a=new AbstractPrgm(); //object creation is possible in abstract class
        a.printInfo();
        a.getInfo();
    }
    
}