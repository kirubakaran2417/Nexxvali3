package OOPS;

public class Car {

	
	//properties or fields 
	//variables
	String type;
	int speed;
	
	//methods
	public void display() {
		System.out.println(type+" "+speed);
	}
	
	public static void main(String[] args) {
		Car jeepcompass = new Car();
		jeepcompass.type="suv";
		jeepcompass.speed=200;
		jeepcompass.display();
		
		Car wrangler=new Car();
		wrangler.type="sedan";
		wrangler.speed=250;
		wrangler.display();
	}

}
