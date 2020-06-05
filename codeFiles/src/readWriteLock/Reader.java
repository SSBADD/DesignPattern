package readWriteLock;



//这个类用来模拟读操作
public class Reader extends Thread {

	
	
	private final Data data;
	public Reader(Data data) {
		this.data=data;
	}
	public void run() {
		try {
			while(true) {
				char[]readbuf=data.read();
				System.out.println(Thread.currentThread().getName()+"  reads   "+String.valueOf(readbuf));
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
