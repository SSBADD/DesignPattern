package noSingle;

public class Bridge {
	
	
	private int counter =0;//用来记录已经过桥的人数
	private String name="Nobody";
	private String address="Nowhere";
	
	//pass函数用来表示有人在过桥,并且更新过桥人的名字和来源
	public void pass(String name ,String address) {
		this.counter++;
		this.name=name;
		this.address=address;
		check();
	}
	
	public String toString() {
		return "No."+counter+":  "+name +",  "+address;
	}
	//check函数用来检查桥上是不是在同一时刻只有一个人
	//如果不是的话输出提示信息
	//(在模拟多人过桥的时候特地设计成人名和对应的来源首字母一致,依次来检查桥上是不是只有1个人
	private void check() {
		if(name.charAt(0)!=address.charAt(0)) {
			System.out.println("WARNING:"+toString());
		}
	}
	
}
