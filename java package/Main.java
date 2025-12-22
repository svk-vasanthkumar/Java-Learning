package svk;
class person{
	public String name;
	protected int age;
	
	private String ssn;
	String address;
	
	
	void per (String name, int age, String ssn, String address) {
		this.name=name;
		this.age=age;
		this.ssn=ssn;
		this.address = address;
		System.out.println(ssn);
	}
}
class employee extends person{
	void emp () {
		System.out.println(name +"  "+ age +"  "  + address);
	}
    
	
}
public class Main {

	public static void main(String[] args) {
		employee e = new employee();
		e.per("vasanth",19,"1122","kjkj");
		e.emp();
		
		
		

	}

}
