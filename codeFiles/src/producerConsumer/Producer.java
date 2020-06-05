package producerConsumer;
import java.util.Random;

//��������ģ����ʦ���������龰
public class Producer extends Thread {

	
	
	private  final Random random;
	private final Table table ;
	private static int id =0;//���ֶα����������߹���,������ʶ���������������ĵ�����ˮ��
	
	public  Producer(String name ,Table table ,long seed ) {
		super(name);
		this.table=table;
		this.random=new Random(seed);
	}
	
	public void run() {
		try {
			while(true) {
				Thread.sleep(random.nextInt(1000));//�߳���ͣ,ģ����ʦ�����������
				String cake="[ Cake = No. "+nextId()+" by "+getName()+" ]";
				table.put(cake);//�Ѹ�����������
				
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static synchronized int nextId() {
		return id++;
	}
}
