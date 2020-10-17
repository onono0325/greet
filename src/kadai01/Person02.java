package kadai01;

public class Person02   extends Person{
	public void greet(String hello02) {
		if (hello02.equals("Hello")) {
			System.out.println("応接室へどうぞ");
		}else {
			System.out.println("お帰り下さい");
		}
	}
}
