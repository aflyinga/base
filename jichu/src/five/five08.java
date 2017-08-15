package five;
//只是为了验证this用法！！不应该在实践中这样写！！！！！
public class five08 {
      
	public void a(){
		  b();
		//相当于a().b()
		  this.b();//this只的是 当前对象！！！只有在必要时用this为了便于读懂
	}
	public void b(){
		System.out.println("dadada");
	}
	public static void main(String[] args) {
		new five08().a();
	}
}
