package kadai01;

abstract public class Person implements Communication  {
	private String name;
	private String type;
	
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void printData() {
		System.out.println(this.type + "の" + this.name + "さんですね。");
		System.out.print("挨拶してください: ");
	}
	
}
