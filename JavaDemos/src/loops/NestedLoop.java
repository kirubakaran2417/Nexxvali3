package loops;

public class NestedLoop {
public static void main(String[] args) {
	
	for(int j=1;j<=2;j++) {
		System.out.println("Week: "+j);
		for(int i=1;i<=5;i++) {
			System.out.println("Working Day: "+i);
		}
	}
}
}