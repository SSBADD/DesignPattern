package producerConsumer;

public class Main {

	
	public static void main(String [] args) {
		Table table =new Table(3);//代表桌子上最多放三个糕点
		
		new Producer("Producer-1",table,31415).start();
		new Producer("Producer-1",table,41315).start();
		new Producer("Producer-1",table,65415).start();
		
		
		new Consumer("Consumer-1",table,34315).start();
		new Consumer("Consumer-1",table,71325).start();
		new Consumer("Consumer-1",table,33645).start();
	}
}
