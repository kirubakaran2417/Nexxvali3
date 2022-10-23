package exercises;

import java.util.Scanner;

public class ConsecutiveNumbers {

	public void consecutivemethod(int x,int y,int z) {
		int maxnumber=Math.max(x,Math.max(y, z));
		int minnumber=Math.min(x, Math.min(y, z));
		int middlenumber=x+y+z-maxnumber-minnumber;
		boolean status=(maxnumber-middlenumber)==1 && (middlenumber -minnumber)==1;
		if(status==true) {
			System.out.println("yes this numbers are consecutive");
		}else {
			System.out.println("No this numbers are not consecutive");
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println("Check whether the numbers are consecutive or not");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=s.nextInt();
		System.out.println("Enter the value of y");
		int y=s.nextInt();
		System.out.println("Enter the value of z");
		int z=s.nextInt();
		
		ConsecutiveNumbers cn=new ConsecutiveNumbers();
		cn.consecutivemethod(x, y, z);
	}
}
//write a class with a method with parameter as limit need to return a series like 
//0 1 1 2 3 5 8 13 21 34


//1,2,3,4