package seven;

public class seven08 extends Bb{
    public static void main(String[] args) {
    	new Bb();
		new Bb(1);
	}
}


class Aa{
	public Aa(int i){
		System.out.println("A������");
	}
}

class Bb extends Aa{
	public Bb(){
		super(13);
		System.out.println("Ĭ�Ϲ�����");
		
	}
	public Bb(int i){
		super(12);
		System.out.println("������������");
	}
}
