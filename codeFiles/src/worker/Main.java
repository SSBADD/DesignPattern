package worker;

public class Main {

	
	
	public static void main(String [] args) {
		Channel channel =new Channel(5);//工人线程的个数
		channel.startWorkers();
		new Client("A",channel).start();
		new Client("B",channel).start();
		new Client("C",channel).start();
	}
}
