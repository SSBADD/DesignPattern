package producerConsumer;
import java.util.Random;

//该类用来模拟顾客消耗糕点
public class Consumer extends Thread {

	private final Random random ;
	private final Table table ;
	public Consumer(String name ,Table  table ,long seed ) {
		super(name );
		this.table =table ;
		this.random =new Random(seed);
		
	}
	public void run() {
		try {
			while(true) {
				String cake = table.take();
				Thread.sleep(random.nextInt(1000));
			}
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
	}
 

}
