package three;

public class three04 {
    public static void main(String[] args) {
    	float l=254.3f;
    	float t=12.3f;
    	
		System.out.println("距离为"+l);
		System.out.println("时间为"+t);
		
		float v=dada.sudu(l, t);//调用dada中sudu方法，并把t和l值穿进去
		System.out.println("速度为"+v);
	}
}
class dada{

	

	public static float sudu(float l,float t){
		if (t==0)return 0f;//判断t是否为0
			else 
				return l/t;
	
	}
}