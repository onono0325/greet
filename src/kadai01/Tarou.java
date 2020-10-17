package kadai01;

public class Tarou extends Person{
	public void greet(String hello) {
		if (hello.equals("Hello")) {
			System.out.println("Hello");
		} else {
			System.out.println("   ");
		}
	}
}