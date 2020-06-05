package producerConsumer;

public class Table {

	private final String [] buffer;
	private int tail;//下一次put位置
	private int head;//下一次take位置
	private int count;//buffer 中蛋糕数量
	
	public Table(int count ) {
		this.buffer=new String[count];
		this.tail=0;
		this.head=0;
		this.count=count;
		
	}
	
	//放置蛋糕
	public synchronized void put(String cake) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"  puts  "  +cake);
		while(count>=buffer.length) {
			wait();
		}
		buffer[tail]=cake;
		tail=(tail+1)%buffer.length;
		count++;
		notifyAll();
	}
	//拿走蛋糕
	public synchronized  String  take()throws  InterruptedException {
		while(count<=0) {
			wait();
		}
		String cake=buffer[head];
		head=(head+1)%buffer.length;
		count--;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+"  takes  "  +cake);
		return cake ;
	}

}
