package seven;

import five.staticInitialization;

public class seven16 {
   public static void main(String[] args) {
	Amphibian ag=new Frog();//����ת��  frogתΪAmphibian����
	ag.am(ag);//ag�Ƕ�frog���������  ����̬��
	ag.bm(ag);
   }
}

class Amphibian{
	public void am(Amphibian i){
		System.out.println("aaaaaaaa");
	}
	public void bm(Amphibian i){
		System.out.println("bbbbbb");
	}
}
class Frog extends Amphibian{
	public void am(Amphibian i){
		System.out.println("frog aaaaaa");
	}
	public void bm(Amphibian i){
		System.out.println("frog bbbbbb");
	}
}
