package Single;

public class Bridge {
	
	
	private int counter =0;//用来记录已经过桥的人数
	private String name="Nobody";
	private String address="Nowhere";
	
	//pass 函数添加synchronized 关键字,限制每一次只允许一个人通过
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
