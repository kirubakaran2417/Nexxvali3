package loops;

public class WHilenestedloop {
public static void main(String[] args) {
	int i=1;
	while(i<=2) {
		System.out.println("Week: "+i);
		i++;
		int j=1;
		while(j<=5) {
			System.out.println("Working Day: "+j);
			j++;System.out.println("Working Day: "+i);
		}
	}
}
}
