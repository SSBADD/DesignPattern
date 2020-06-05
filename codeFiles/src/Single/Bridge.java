package Single;

public class Bridge {
	
	
	private int counter =0;//������¼�Ѿ����ŵ�����
	private String name="Nobody";
	private String address="Nowhere";
	
	//pass �������synchronized �ؼ���,����ÿһ��ֻ����һ����ͨ��
	public synchronized void pass(String name ,String address) {
		this.counter++;
		this.name=name;
		this.address=address;
		check();
	}
	
	public  synchronized String toString() {
		return "No."+counter+":  "+name +",  "+address;
	}
	
	private void check() {
		if(name.charAt(0)!=address.charAt(0)) {
			System.out.println("WARNING:"+toString());
		}
	}
	
}
