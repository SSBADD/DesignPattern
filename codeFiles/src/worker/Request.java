package worker;

import java.util.Random;

public class Request {

	
	private final String name ;//ί����
	private final int  number;//����ı��
	private static final Random random =new Random();
	public Request(String name ,int number) {
		this.name=name;
		this.number=number;
		
	}
	
	public void execute() {
		System.out.println(Thread.currentThread().getName()+"  Executes  "+this);
		try {
			Thread.sleep(random.nextInt(1000));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public  String toString() {
		
		return "[  Request  from  "+ name +"  No.  "+number +"  ]";
	}
}
