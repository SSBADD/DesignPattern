package readWriteLock;

public class ReadWriteLock {

	
	private int readingReaders=0;//��ʾʵ�����ڶ�ȡ�е��̸߳���
	private int waitingWriters=0;//��ʾ���ڵȴ�д����̸߳���
	private int writingWriters=0;//ʵ������д���е��̸߳���
	private  boolean  preferWriter=true;//��д������,��Ϊtrue;
	
	
	public synchronized void readLock() throws InterruptedException {
		while(writingWriters>0||(preferWriter&&waitingWriters>0)) {
			wait();
		}
		readingReaders++;
	}
	
	public synchronized void readUnlock() {
		readingReaders--;
		preferWriter=true;
		notifyAll();
	}
	
	public synchronized void writeLock() throws InterruptedException {
		waitingWriters++;
		try {
			while(readingReaders>0||writingWriters>0) {
				wait();
			}
		}finally {
			waitingWriters--;
		}
		
		writingWriters++;
	}
	
	
	public synchronized void writeUnlock() {
		writingWriters--;
		preferWriter=false;
		notifyAll();
	}
}
