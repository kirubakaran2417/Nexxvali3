package accessSpecifier;

public class PrivateExample {
	
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
