package three;
import java.util.*;


//�����������
public class three02 {
	
	
	public static void main(String[] args) {
		haha a1=new haha();
		haha a2=new haha();
		a1.a=1.2f;
		a2.a=2.4f;
		System.out.println("1..a1.a="+a1.a+"a2.a="+a2.a);
		a1=a2;//��a2��������ô���a1
		System.out.println("1..a1.a="+a1.a+"a2.a="+a2.a);
		a1.a=21.3f;//a1��a2����ͬ�����ã���Ҳ�Ͱ�������ͬ�Ķ���
		System.out.println("1..a1.a="+a1.a+"a2.a="+a2.a);
	}

}
class haha{
		float a;
	}