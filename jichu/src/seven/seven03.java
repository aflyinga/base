package seven;

public class seven03 extends Drawing {//�����������˻���Drawing�Ĺ��캯��
		 public static void main(String[] args) {
		new seven03();
		}
}
class Art{
	Art(){
		System.out.println("����");
	}
}
class Drawing extends Art{//���û��ࣨArt���Ĺ��캯��
	public Drawing() {
		System.out.println("����");
	}
}
/*
1���������������seven03���캯���� TIJ4ͨ���ڹ��캯���д�ӡ��ʾ�������
2�������ϳ�Ĭ�ϵ�seven03���캯�����������е����˻���Drawing��Ĭ�Ϲ��캯����
�����ε����˻���Art��Ĭ�Ϲ��캯����
3������ȷ�����ù��캯���� ��������ù��캯��������Ĭ�Ϲ��캯����������ã�
 ���ǣ�����������κι��캯����������Ĭ�Ϲ��캯�����򲻻�ϳ�Ĭ�Ϲ��캯����
*/