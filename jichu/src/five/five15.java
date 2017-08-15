package five;

import java.io.PrintWriter;

public class five15 {
      String a;
      {
    	  a="aaaaa";//实例初始化发生在两个构造函数之前！！！
      }
     public five15() {
    	  System.out.println("默认构造函数：a="+a);
    	  
      }
     public five15(int i){
    	 System.out.println("int形构造器：a="+a);
     }
      public static void main(String[] args) {
		new five15();
		new five15(4);
	}
}
