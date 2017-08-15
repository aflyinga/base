package seven;

public class seven08 extends Bb{
    public static void main(String[] args) {
    	new Bb();
		new Bb(1);
	}
}


class Aa{
	public Aa(int i){
		System.out.println("A构造器");
	}
}

class Bb extends Aa{
	public Bb(){
		super(13);
		System.out.println("默认构造器");
		
	}
	public Bb(int i){
		super(12);
		System.out.println("带参数构造器");
	}
}
