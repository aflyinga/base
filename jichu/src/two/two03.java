package two;

public class two03 {
	public static void main(String[] args) {
		ATypeName a=new ATypeName();
		a.i=10;
		a.out();//����out����
	}

}
class ATypeName{
	
	   int i;
	   public void out(){
		System.out.println(i);//�������
		
	}
	
}