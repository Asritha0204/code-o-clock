package Basic;

public class ThisVariable {
	int registerNo;
	String name;
	ThisVariable(int registerNo,String name){
		this.registerNo=registerNo;
		this.name=name;
	}
	void showData() {
		System.out.println("Register Number is "+registerNo);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		ThisVariable tv=new ThisVariable(26,"Bunny");
		tv.showData();
	}
}

