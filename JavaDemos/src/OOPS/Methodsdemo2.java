package OOPS;

public class Methodsdemo2 {
	
	void add(int a,int b) {//here int a and b are parameters
		//write the logic of adding two numbers and print it in console
		System.out.println(a+b);	
	}
	//creating main method
	public static void main(String[] args) {
		//create object
		//classname objectname=new classname();
		//while calling those methods you have to pass arguments
		Methodsdemo2 m=new Methodsdemo2();
		//objectname.methodname();
		m.add(25,35);//here 25,35 are arguments
	}
	
}
