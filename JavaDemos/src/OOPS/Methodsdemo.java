package OOPS;

public class Methodsdemo {

	int a=10;
	int b=20;
	//System.out.println(a+b);
	/*
	 * it is a invalid syntax inside the class
	 * we cannot write directly the business logic of application
	 * we have to write the logic inside the method
	 */
	
	//declaration of method
	void add() {
		//write the logic of adding two numbers and print it in console
		System.out.println(a+b);	
	}
	//creating main method
	public static void main(String[] args) {
		//create object
		//classname objectname=new classname();
		Methodsdemo kazi=new Methodsdemo();
		//objectname.methodname();
		kazi.add();
	}
	
}
