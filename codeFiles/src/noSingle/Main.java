package noSingle;
//这个类用来实现模拟多个人过桥的场景
public class Main {

	public static void main(String [] args) {
		System.out.println("Testing Bridge,hit CTRL+C to exit.");
		Bridge bridge=new Bridge();
		
		//模拟多人过桥
		new Human(bridge,"Alice","Am").start();
		new Human(bridge,"Bob","Borin").start();
		new Human(bridge,"Clina","China").start();
	}
}
