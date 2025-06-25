package Constructor;

public class ConstructorwithArguments{
	int registerNo;
	String name;
	String dept;
	boolean isContinue;
	ConstructorwithArguments(){
		registerNo=26;
		name="Naina Thalwar";
		dept="CSE";
		isContinue=true;
	}
	ConstructorwithArguments(int r,String n,String d,boolean ic){
		registerNo=r;
		name=n;
		dept=d;
		isContinue=ic;
	}
	void printData() {
		System.out.println("Register Number is "+registerNo);
		System.out.println("Name is "+name);
		System.out.println("Department is "+dept);
		System.out.println("Is Active "+isContinue);
	}
	public static void main(String[] args) {
		ConstructorwithArguments c=new ConstructorwithArguments();
		ConstructorwithArguments c1=new ConstructorwithArguments(38,"Kabir Thapar","Phsycology",true);
		c.printData();
		c1.printData();
	}
}