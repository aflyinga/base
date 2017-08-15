package five;

public class five09 {
     public five09(int i) {
		this("i="+i);
	}
     five09 (String s){
    	 System.out.println("s="+s);//+会加上两个字符串
     }
     public static void main(String[] args) {
		new five09("adasda");
		new five09(23);
	}
}
