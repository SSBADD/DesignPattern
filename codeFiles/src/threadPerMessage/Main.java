package threadPerMessage;

public class Main {
	public static void main (String [] args) {
		
		System.out.println("Start");
		Host host=new Host();
		host.request(10,'A');
		host.request(20,'B');
		host.request(30,'C');
		System.out.println("End");
	}
}
