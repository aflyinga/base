package three;

public class three04 {
    public static void main(String[] args) {
    	float l=254.3f;
    	float t=12.3f;
    	
		System.out.println("����Ϊ"+l);
		System.out.println("ʱ��Ϊ"+t);
		
		float v=dada.sudu(l, t);//����dada��sudu����������t��lֵ����ȥ
		System.out.println("�ٶ�Ϊ"+v);
	}
}
class dada{

	

	public static float sudu(float l,float t){
		if (t==0)return 0f;//�ж�t�Ƿ�Ϊ0
			else 
				return l/t;
	
	}
}