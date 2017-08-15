package seven;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

import org.omg.CORBA.PRIVATE_MEMBER;

public class seven01 {
	public static void main(String[] args) {
		Second second=new Second("Init String");//初始化只发生了一次
		second.check();
		System.out.println(second.getFirst());
		second.check();
		System.out.println(second);
		second.setFirst("new string");
	    System.out.println(second);
	}
}

class First{//第一个类的数据和方法
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
//把对first的引用置于second（新 类）中主函数直接调用second来
//间接复用first类就是组合语法！！！！
class Second{
	First first;//first没被初始化
	String s;
	public Second(String si){
		s=si;//first 没有初始化
	}
	public void check(){
		if(first==null){
			System.out.println("没有初始化");
		}
		else{
			System.out.println("被初始化");
		}
	}
	private First lazy(){//延迟初始化or惰性初始化
		if(first==null){
			System.out.println("创建first");
			first=new First(s);
		}
		return first;
	}
	public First getFirst(){
		return lazy();
		
	}
	public String toString(){
		return lazy().toString();//调用tostring()
	
	}
	public void setFirst(String sNew){
		lazy().setString(sNew);
	}
}