package svk;

interface Playable{
	void Play();
}
class guitar implements Playable{
	public void Play() {
		System.out.println("tuuuu teeeee uuuu");
		
	}
	
}
class piano implements Playable{
	public void Play() {
		System.out.println("ttt eeeee wwww qqq");
		
	}
	
}



public class inter2 {
	public static void main (String args[]) {
		
		guitar gu = new guitar();
		gu.Play();
		piano pi = new piano();
		pi.Play();
		
		
	}

}
