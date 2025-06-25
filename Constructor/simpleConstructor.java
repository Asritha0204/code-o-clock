package Constructor; 

public class simpleConstructor {
    int registerNumber;
    String name;
    simpleConstructor(){
        registerNumber=1;
        name="Naina";
    }
    void printData(){
        System.out.println("Register Number: "+registerNumber);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        simpleConstructor s=new simpleConstructor();
        s.printData();
    }
}
