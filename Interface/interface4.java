package svk;
interface Readable{
	void read();
}
interface Writable{
	default void write() {
		System.out.println("kdffdjj");
		
	}
}
interface Storable{
	default void store() {
		System.out.println("kdjdfkj");
	}
}
class File implements Readable, Writable, Storable{
	public void read() {
		System.out.println("readdding");
		
	}
	
}

public class interface4 {
	public static void main(String args[]) {
		File fi = new File();
		fi.read();
		fi.write();
		fi.store();
	}

}
