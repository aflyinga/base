package three;

public class equalswai {
    public static void main(String[] args) {
		Value v1=new Value();
		Value v2=new Value();
		v1.i=v2.i=100;
		System.out.println(v1.equals(v2));//equalsĬ����Ϊ�Ƚ�����Ҫ�������и���equals��������
		System .out.println(v1==v2);
	}
}

class Value{//�������Լ� ���࣡����Ҫ����equals��������������Ĭ�ϱȽ�����
	int i;
}
