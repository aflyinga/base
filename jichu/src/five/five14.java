package five;

public class five14 {
     static String a="aaaaaaa";//静态定义时初始化
     static String b; 
     static{//静态块
    	 b="bbbbbbbb";
    	 
     }
       public static void main(String[] args) {
		System.out.println("a="+a);
    	System.out.println("b="+b);
	}
}
