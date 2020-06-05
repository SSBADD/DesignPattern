package producerConsumer;
import java.util.Random;

//该类用来模拟糕点师产生糕点的情景
public class Producer extends Thread {

	
	
	private  final Random random;
	private final Table table ;
	private static int id =0;//该字段被所有生产者共用,用来标识所有生产者生产的蛋糕流水号
	
	public  Producer(String name ,Table table ,long seed ) {
		super(name);
		this.table=table;
		this.random=new Random(seed);
	}
	
	public void run() {
		try {
			while(true) {
				Thread.sleep(random.nextInt(1000));//线程暂停,模拟糕点师正在制作糕点
				String cake="[ Cake = No. "+nextId()+" by "+getName()+" ]";
				table.put(cake);//把糕点放在桌子上
				
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static synchronized int nextId() {
		return id++;
	}
}
