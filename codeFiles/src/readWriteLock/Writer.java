package readWriteLock;

import java.util.Random;

//这个类被创建用来模拟多个写者对共享资源进行写操作
public class Writer extends Thread {

	
	private static final Random random=new Random();
	private final Data data;
	private final String filler;
	private int index =0;
	public Writer(Data data ,String filler) {
		this.data=data;
		this.filler=filler;
		
	}
	
	public void run() {
		try {
			while(true) {
				char c=nextchar();
				data.write(c);
				Thread.sleep(random.nextInt(3000));
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private char nextchar() {
		char c =filler.charAt(index);
		index++;
		
		
		if(index>=filler.length()) {
			index =0;
		}
		return c;
	}
	
	
}
