package noSingle;

public class Bridge {
	
	
	private int counter =0;//������¼�Ѿ����ŵ�����
	private String name="Nobody";
	private String address="Nowhere";
	
	//pass����������ʾ�����ڹ���,���Ҹ��¹����˵����ֺ���Դ
	public void pass(String name ,String address) {
		this.counter++;
		this.name=name;
		this.address=address;
		check();
	}
	
	public String toString() {
		return "No."+counter+":  "+name +",  "+address;
	}
	//check����������������ǲ�����ͬһʱ��ֻ��һ����
	//������ǵĻ������ʾ��Ϣ
	//(��ģ����˹��ŵ�ʱ���ص���Ƴ������Ͷ�Ӧ����Դ����ĸһ��,��������������ǲ���ֻ��1����
	private void check() {
		if(name.charAt(0)!=address.charAt(0)) {
			System.out.println("WARNING:"+toString());
		}
	}
	
}
