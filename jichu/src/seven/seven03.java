package seven;

public class seven03 extends Drawing {//编译器调用了基类Drawing的构造函数
		 public static void main(String[] args) {
		new seven03();
		}
}
class Art{
	Art(){
		System.out.println("美术");
	}
}
class Drawing extends Art{//调用基类（Art）的构造函数
	public Drawing() {
		System.out.println("画画");
	}
}
/*
1我们评论了上面的seven03构造函数。 TIJ4通过在构造函数中打印显示此输出。
2编译器合成默认的seven03构造函数，它在其中调用了基类Drawing的默认构造函数，
它依次调用了基类Art的默认构造函数。
3编译器确保调用构造函数。 如果不调用构造函数，调用默认构造函数（如果可用）
 但是，如果您定义任何构造函数，而不是默认构造函数，则不会合成默认构造函数。
*/