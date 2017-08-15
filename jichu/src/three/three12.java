package three;

public class three12 {
     public static void main(String[] args) {
		int l1=15;
		System.out.println("li二进制： "+Integer.toBinaryString(l1));
		l1<<=1;
		System.out.println("li二进制： "+Integer.toBinaryString(l1));
		l1<<=1;
		System.out.println("li二进制： "+Integer.toBinaryString(l1));
		l1<<=1;
		System.out.println("li二进制： "+Integer.toBinaryString(l1));
		l1>>>=1;
		System.out.println("li二进制： "+Integer.toBinaryString(l1));
		l1>>>=3;
		System.out.println("li二进制： "+Integer.toBinaryString(l1));
	}
}
