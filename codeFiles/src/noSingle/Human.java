package noSingle;


//����౻����ΪThread�������,������ʾ����ͨ���ŵ���

public class Human  extends  Thread {
	
	private final Bridge bridge;//��ʾ��ͨ������
	private final String myName;//��ʾ����,��ʼ����һֱ����
	private final String myAddress;//��ʾ����Դ,��ʼ����һֱ����
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
