package Basic;
public class FinalVariable {
    public final int registerNo=12345;
    public final String name;
    //In case value is not assigned at the time of declaration then it should be initialized in constructor
    FinalVariable(){
        name="Naina";
    }
    //final variable value not allow us to change the value once it assigned
    void printData(){
        System.out.println("Register Number: "+registerNo);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        FinalVariable f=new FinalVariable();
        f.printData();
    }
    
}
