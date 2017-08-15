package three;

public class three10 {
       public static void main(String[] args) {
		int l1=0x15;//十六进制表示
		int l2=0xa;
		System.out.println("l1为:"+Integer.toBinaryString(l1));
		System.out.println("l2为:"+Integer.toBinaryString(l2));
		System.out.println("~l1为:"+Integer.toBinaryString(~l1));
		System.out.println("~l2为:"+Integer.toBinaryString(~l2));
		System.out.println("l1&l2="+Integer.toBinaryString(l1&l2));
		System.out.println("l1|l2="+Integer.toBinaryString(l1|l2));
		System.out.println("l1^l2="+Integer.toBinaryString(l1^l2));
		System.out.println("l1&l1="+Integer.toBinaryString(l1&l1));
		System.out.println("l1|l1="+Integer.toBinaryString(l1|l1));
		System.out.println("l1^l1="+Integer.toBinaryString(l1^l1));
	}
}
