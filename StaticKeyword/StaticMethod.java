package StaticKeyword;

public class StaticMethod {
    int count=0;
    static int count1=0;
    static void increment() {// static method
        count1=count1+1;
    }
    void incrementNonStatic() {
        count=count+1;
    }
    void printData() {
        System.out.println("The non-static count value is "+count);
        System.out.println("The static count1 value is "+count1);
    }
    public static void main(String[] args) {
        StaticMethod s=new StaticMethod();// Creating object
        StaticMethod.increment();// Calling static method
        s.incrementNonStatic();// Calling non-static method
        StaticMethod.increment();// again calling static method
        s.incrementNonStatic();// again calling non-static method
        s.printData();// calling printData method
        StaticMethod sm=new StaticMethod();// Creating another object
        StaticMethod.increment();// Calling static method
        sm.incrementNonStatic();// Calling non-static method
        StaticMethod.increment();// again calling static method
        sm.incrementNonStatic();// again calling non-static method
        sm.printData();// calling printData method
    }
}
