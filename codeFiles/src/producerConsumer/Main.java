package producerConsumer;

public class Main {

	
	public static void main(String [] args) {
		Table table =new Table(3);//���������������������
		
		new Producer("Producer-1",table,31415).start();
		new Producer("Producer-1",table,41315).start();
		new Producer("Producer-1",table,65415).start();
		
		
		new Consumer("Consumer-1",table,34315).start();
		new Consumer("Consumer-1",table,71325).start();
		new Consumer("Consumer-1",table,33645).start();
	}
}
