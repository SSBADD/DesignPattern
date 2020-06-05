package worker;



public class Channel {
	private  static final  int MAX_REQUEST=100;
	
	private final Request[] requestQueue;
	private int tail;//�´�putRequest��λ��
	private int head;//�´�takeRequest��λ��
	private int  count;//Request������
	
	private final Worker[] threadPool;
	public Channel (int threads) {
		this.requestQueue=new Request[MAX_REQUEST];
		this.head=0;
		this.tail=0;
		this.count=0;
		threadPool=new  Worker[threads];
		for(int i=0;i<threadPool.length;i++) {
			threadPool[i]=new Worker("Worker-"+i,this);
		}
	}
	
	public void startWorkers() {
		for(int i=0;i<threadPool.length;i++) {
			threadPool[i].start();
		}
	}
	public synchronized void putRequest (Request req) {
		while(count>=requestQueue.length) {
			try {
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		requestQueue[tail]=req;
		tail=(tail+1)%requestQueue.length;
		count++;
		notifyAll();
	}
	public synchronized Request takeRequest() {
		while(count <=0) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		Request req=requestQueue[head];
		head=(head+1)%requestQueue.length;
		count--;
		notifyAll();
		return req;
		
	}
	
	
	
}