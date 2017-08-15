package three;

import java.util.Random;

public class three07 {
	public static void main(String[] args) {
		Random a=new Random(47);//47魔幻数字，随机会出现同一个数，不管循环几次。
      boolean b=a.nextBoolean();
      System.out.println(b ? "正面":"反面");
	}
      
}
