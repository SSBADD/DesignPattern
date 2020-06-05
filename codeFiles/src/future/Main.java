package future;


//模拟取蛋糕的场景
public class Main {

	public static void main(String [] agrs) {
		System.out.println("Start");
		Host host=new Host();
		Data data1=host.request(10,'A');
		Data data2=host.request(20,'B');
		Data data3=host.request(30,'C');
		
		System.out.println("do otherJob ");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("otherJob  End");
		System.out.println("data1  =  "+ data1.getContent());
		System.out.println("data2  =  "+ data2.getContent());
		System.out.println("data3  =  "+ data3.getContent());
		System.out.println("End");
	}
	
}
