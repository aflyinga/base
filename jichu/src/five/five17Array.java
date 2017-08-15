package five;

public class five17Array {
		public five17Array(){
			
		}
		public five17Array(String a){
			System.out.println("string构造函数：a="+a);//看不到初始化消息	因为该类实例不存在	
			
		}
		five17Array []b=new five17Array[5];//仅创建数组，没有进入它 的对象
		public static void main(String[] args) {
			five17Array []c=new five17Array[5];
		}
}
