package readWriteLock;

public class Main {

	
	public static void main (String [] args) {
	
		
		Data data=new Data(10);
		new Reader(data).start();
		new Reader(data).start();
		new Reader(data).start();
		new Reader(data).start();
		new Reader(data).start();
		new Reader(data).start();
		
		
		new Writer(data,"ABCDEFGHIJKLMN").start();
		new Writer(data,"abcdefghijklmn").start();
	}
}
