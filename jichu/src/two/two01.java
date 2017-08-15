package two;

import java.util.Random;
//验证java执行了默认初始化
public class two01 {
	    
     public static void main(String[] args) {
		int a=10;
		int b=454;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+"b="+b);
	}
}


