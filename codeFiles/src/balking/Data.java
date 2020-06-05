package balking;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {

	
	
	private final String filename;//������ļ�����
	private String content;//��������
	private boolean changed;//�޸ĺ��������δ����,Ϊtrue
	public Data(String filename,String content) {
		this.filename=filename;
		this.content=content;
		this.changed=true;
	}
	//�޸���������
	public synchronized void change (String newContent) {
		content =newContent;
		changed=true;
	}
	//�����������޸Ĺ�,�򱣴浽�ļ���
	public synchronized void save()throws IOException{
		if(!changed) {
			return ;
		}
		doSave();
		changed=false;
	}
	//����������ʵ�ʱ��浽�ļ���ȥ
	private void doSave()throws  IOException{
		System.out.println(Thread.currentThread().getName()+" calls  doSave,  content="+  content);
		Writer writer =new FileWriter(filename);
		
		writer.write(content);
		writer.close();
	}
	
}
