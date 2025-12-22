package svk;


class Counter{
	static int count;
	int instanceNumber;
	void show() {
		count ++;
		instanceNumber ++;
		System.out.println(count+"count");
		System.out.println(instanceNumber+"insNum");
	}
}


public class Main1 {

	public static void main(String[] args) {
		Counter co = new Counter();
		co.show();
		Counter co1 = new Counter();
		co1.show(); 
		Counter co2 = new Counter();
		co2.show();
		Counter co3 = new Counter();
		co3.show();
		Counter co33 = new Counter();
		co33.show();
		Counter co44 = new Counter();
		co44.show();
		
		
		
		
	}

}
