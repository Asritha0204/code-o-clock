package Interface;

public class StudentInformation implements Information {
    public  void getData() {
        System.out.println("I am get data method of StudentInformation class");
    }
    
    public void printData() {
        System.out.println("I am print data method of StudentInformation class");
    }
    public static void main(String[] args) {
        StudentInformation s=new StudentInformation();
        s.getData();
        s.printData();
    }
    
}
