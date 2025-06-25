package Basic;

public class ThisComplete {
	int registerNo;
	String name;
	ThisComplete(){
		registerNo=38;
		name="Lalli";
	}
	ThisComplete(int registerNo, String name){
		this();   //it checks is there any empty constructor
		this.showData();
		this.registerNo=registerNo;
		this.name=name;
		this.showData();
	}
	void showData() {
		System.out.println("Register Number is "+registerNo);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		ThisComplete thc=new ThisComplete(26,"Bunny");
		thc.showData();
	}
}
