package seven;

import five.staticInitialization;

public class seven16 {
   public static void main(String[] args) {
	Amphibian ag=new Frog();//向上转型  frog转为Amphibian类型
	ag.am(ag);//ag是对frog对象的引用  （多态）
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
