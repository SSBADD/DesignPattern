package noSingle;


//这个类被声明为Thread类的子类,用来表示不断通过桥的人

public class Human  extends  Thread {
	
	private final Bridge bridge;//表示人通过的桥
	private final String myName;//表示人名,初始化后一直不变
	private final String myAddress;//表示人来源,初始化后一直不变
	public Human(Bridge bridge,String myName ,String myAddress) {
		this.bridge=bridge;
		this.myAddress=myAddress;
		this.myName=myName;
	}
	


	public void  run() {
		System.out.println(myName+"  start to across bridge");
		while(true) {
			bridge.pass(myName,myAddress);
		}
	}

}
