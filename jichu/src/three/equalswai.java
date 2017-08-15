package three;

public class equalswai {
    public static void main(String[] args) {
		Value v1=new Value();
		Value v2=new Value();
		v1.i=v2.i=100;
		System.out.println(v1.equals(v2));//equals默认行为比较引用要再新类中覆盖equals（）方法
		System .out.println(v1==v2);
	}
}

class Value{//创建了自己 的类！！！要覆盖equals方法，否则他会默认比较引用
	int i;
}
