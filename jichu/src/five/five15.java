package five;

import java.io.PrintWriter;

public class five15 {
      String a;
      {
    	  a="aaaaa";//ʵ����ʼ���������������캯��֮ǰ������
      }
     public five15() {
    	  System.out.println("Ĭ�Ϲ��캯����a="+a);
    	  
      }
     public five15(int i){
    	 System.out.println("int�ι�������a="+a);
     }
      public static void main(String[] args) {
		new five15();
		new five15(4);
	}
}
