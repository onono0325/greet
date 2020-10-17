package kadai01;

public interface Communication {
	String getName() ;
	String getType();
	
	void setName(String name);
	
	void setType(String type);
	
	void printData();
	
	void greet(String hello);
}
