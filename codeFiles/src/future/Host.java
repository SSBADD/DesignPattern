package future;

public class Host {

	
	public Data request(final int count ,final char c) {
		System.out.println("   request("+count+",  "+c+")  Start");
		
		
		//����һ��FutureData��ʵ��
		final FutureData  future=new FutureData();
		//����һ�����߳�,���ڴ���RealData��ʵ��
		
		new Thread() {
			public void run() {
				RealData realdata =new RealData(count,c);
				future.setRealData(realdata);
				
			}
		}.start();
		
		System.out.println("   request("+count+",  "+c+")  End");
		
		return future;
	}
}
