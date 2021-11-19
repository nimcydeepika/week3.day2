package week3.assignment;

public class Automation implements Language{

	public void selenium() {
		System.out.println("selenium");
	}

	public void java() {
		System.out.println("java");
	}
	public static void main(String[]args) {
		Automation my=new Automation();
		my.selenium();
		my.java();
	}
	
	
}
