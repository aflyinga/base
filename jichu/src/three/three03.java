package three;

public class three03 {
    public static void main(String[] args) {
    	hehe a=new hehe();
    	a.dd=2.4f;
    	System.out.println("1: a.dd="+a.dd);
    	haha(a);//实际上传递了一个引用不是hehe i
    	System.out.println("2:a.dd="+a.dd);

	}
      
    public static void haha(hehe i){//haha方法调用hehe类 
    	
	 i.dd=1.0f;//实际改变的是haha（）之外的对象
}
}

class hehe{//hehe类
	float dd;
	
}
