package Svk.Constractor;

public class ThisKey {
	String myname;
	ThisKey(){
		System.out.println("vasasnth");
	}
	
	void setName(String myname) 
	{
		this.myname= myname;
	}
	
	
	
	public static void main(String args[]) {
		ThisKey obj = new ThisKey();
		obj.setName("svk");
		System.out.println(obj.myname);
		
	}

}
