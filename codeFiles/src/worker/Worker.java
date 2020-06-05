package worker;

public class Worker extends Thread {

	
	private final Channel channel;
	public Worker(String name ,Channel channel) {
		super(name);
		this.channel=channel;
	}
	public void run() {
		while(true) {
			Request req=channel.takeRequest();
			req.execute();
		}
	}
	
}
