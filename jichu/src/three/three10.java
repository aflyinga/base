package three;

public class three10 {
       public static void main(String[] args) {
		int l1=0x15;//ʮ�����Ʊ�ʾ
		int l2=0xa;
		System.out.println("l1Ϊ:"+Integer.toBinaryString(l1));
		System.out.println("l2Ϊ:"+Integer.toBinaryString(l2));
		System.out.println("~l1Ϊ:"+Integer.toBinaryString(~l1));
		System.out.println("~l2Ϊ:"+Integer.toBinaryString(~l2));
		System.out.println("l1&l2="+Integer.toBinaryString(l1&l2));
		System.out.println("l1|l2="+Integer.toBinaryString(l1|l2));
		System.out.println("l1^l2="+Integer.toBinaryString(l1^l2));
		System.out.println("l1&l1="+Integer.toBinaryString(l1&l1));
		System.out.println("l1|l1="+Integer.toBinaryString(l1|l1));
		System.out.println("l1^l1="+Integer.toBinaryString(l1^l1));
	}
}
