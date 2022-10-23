package fundamentals;

public class Logical {
public static void main(String[] args) {
//	&&(and)-->both need to true --->true
	int x=20;
	int y=35;
	
	boolean result=(x<y && y>x);
	System.out.println(result);
	boolean result2=(x<y || y>x );
	System.out.println(result2);
	boolean result3=(x<y || x!=20);
	System.out.println(result3);
}
}
