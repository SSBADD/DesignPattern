package noSingle;
//���������ʵ��ģ�����˹��ŵĳ���
public class Main {

	public static void main(String [] args) {
		System.out.println("Testing Bridge,hit CTRL+C to exit.");
		Bridge bridge=new Bridge();
		
		//ģ����˹���
		new Human(bridge,"Alice","Am").start();
		new Human(bridge,"Bob","Borin").start();
		new Human(bridge,"Clina","China").start();
	}
}
