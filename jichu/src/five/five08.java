package five;
//ֻ��Ϊ����֤this�÷�������Ӧ����ʵ��������д����������
public class five08 {
      
	public void a(){
		  b();
		//�൱��a().b()
		  this.b();//thisֻ���� ��ǰ���󣡣���ֻ���ڱ�Ҫʱ��thisΪ�˱��ڶ���
	}
	public void b(){
		System.out.println("dadada");
	}
	public static void main(String[] args) {
		new five08().a();
	}
}
