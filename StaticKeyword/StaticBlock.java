package StaticKeyword;

public class StaticBlock {
    static{
        System.out.println("Static block 1 is called");
    }
    StaticBlock(){
        System.out.println("Constructor is called");
    }
    static{
        System.out.println("Static block 2 is called");
    }
    static{
        System.out.println("Static block 3 is called");
    }
    void printInfo(){
        System.out.println("This is printInfo method");
    }
    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
        s.printInfo();
    }
    
}
