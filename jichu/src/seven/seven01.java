package seven;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

import org.omg.CORBA.PRIVATE_MEMBER;

public class seven01 {
	public static void main(String[] args) {
		Second second=new Second("Init String");//��ʼ��ֻ������һ��
		second.check();
		System.out.println(second.getFirst());
		second.check();
		System.out.println(second);
		second.setFirst("new string");
	    System.out.println(second);
	}
}

class First{//��һ��������ݺͷ���
	String s;
	public First(String si){
		s=si;
	}
	public String toString(){
		return s;
	}
	public void setString(String sNew){
		s=sNew;
	}
	
}
//�Ѷ�first����������second���� �ࣩ��������ֱ�ӵ���second��
//��Ӹ���first���������﷨��������
class Second{
	First first;//firstû����ʼ��
	String s;
	public Second(String si){
		s=si;//first û�г�ʼ��
	}
	public void check(){
		if(first==null){
			System.out.println("û�г�ʼ��");
		}
		else{
			System.out.println("����ʼ��");
		}
	}
	private First lazy(){//�ӳٳ�ʼ��or���Գ�ʼ��
		if(first==null){
			System.out.println("����first");
			first=new First(s);
		}
		return first;
	}
	public First getFirst(){
		return lazy();
		
	}
	public String toString(){
		return lazy().toString();//����tostring()
	
	}
	public void setFirst(String sNew){
		lazy().setString(sNew);
	}
}