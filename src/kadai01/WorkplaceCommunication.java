package kadai01;
import java.util.Scanner;

public class WorkplaceCommunication {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		
		Tarou tarou = new Tarou( );
		tarou.setName("太郎さん");
		tarou.setType("社員"); 
		tarou.printData();
		String hello = scanner.next();
		tarou.greet(hello);
		
		Person01 person01 = new Person01();
		person01.setName("義男");
		person01.setType("父親"); 
		person01.printData();
		String hello01 = scanner.next();
		person01.greet(hello01);
    
		Person02 person02 = new Person02();
		person02.setName("小野");
		person02.setType("取引先");
		person02.printData();
		String hello02 = scanner.next();
		person02.greet(hello02);
	}
}
