package three;
import java.util.*;


//对象别名现象
public class three02 {
	
	
	public static void main(String[] args) {
		haha a1=new haha();
		haha a2=new haha();
		a1.a=1.2f;
		a2.a=2.4f;
		System.out.println("1..a1.a="+a1.a+"a2.a="+a2.a);
		a1=a2;//把a2对象的引用传给a1
		System.out.println("1..a1.a="+a1.a+"a2.a="+a2.a);
		a1.a=21.3f;//a1和a2是相同的引用，，也就包含了相同的对象
		System.out.println("1..a1.a="+a1.a+"a2.a="+a2.a);
	}

}
class haha{
		float a;
	}