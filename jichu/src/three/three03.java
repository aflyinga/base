package three;

public class three03 {
    public static void main(String[] args) {
    	hehe a=new hehe();
    	a.dd=2.4f;
    	System.out.println("1: a.dd="+a.dd);
    	haha(a);//ʵ���ϴ�����һ�����ò���hehe i
    	System.out.println("2:a.dd="+a.dd);

	}
      
    public static void haha(hehe i){//haha��������hehe�� 
    	
	 i.dd=1.0f;//ʵ�ʸı����haha����֮��Ķ���
}
}

class hehe{//hehe��
	float dd;
	
}
