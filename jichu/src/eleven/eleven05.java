package eleven;


import java.util.*;

import com.mysql.fabric.xmlrpc.base.Array;

public class eleven05 {
       public static void main(String[] args) {
		List<Integer> i=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println("1:"+i);
		i.add(200);//���Ԫ��
		System.out.println("2:"+i);
		System.out.println("3:"+i.contains(200));
		i.remove(Integer.valueOf(200));//ɾ��200Ԫ�أ�װ��
		Integer a=i.get(3);//����ָ��λ�õ�Ԫ�ء�����Ϊ3����Ԫ��
		System.out.println("4:"+a+"  "+i.indexOf(a));//indexOf���ش��б���ָ��Ԫ�صĵ�һ�γ��ֵ�������������б�����Ԫ�أ��򷵻�-1��
		Integer j=Integer.valueOf(1);//����j������ʵ��
		System.out.println("5:"+i.indexOf(j));//����1������ �����ڷ���-1
		System.out.println("6:"+i.remove(j));//������б����ָ����Ԫ�أ���Ϊtrue����false
		System.out.println("7:"+i.remove(a));//ͬʱɾ����Ԫ��  ������ΪԪ�أ�����
		System.out.println("8:"+i);
		i.add(3,0);//������Ϊ3�����Ԫ��0
		System.out.println("9:"+i);
		List<Integer> sub=i.subList(1, 4);//��ӡ����1����������4������������Ԫ��
		System.out.println("sublist:"+sub);
		System.out.println("10:"+i.containsAll(sub));
		Collections.sort(sub);//������Ԫ�ص���Ȼ˳��ָ�����б����������б��е�����Ԫ�ر����໥�ɱȽ�
		System.out.println("sorted  sublist:"+sub);
		System.out.println("11:"+i.containsAll(sub));//˳�������Ҳ����i�б���
		Collections.shuffle(sub);//ʵ���������
		System.out.println("shuffle sub:"+sub);
		System.out.println("12:"+i.containsAll(sub));
		List<Integer> copy=new ArrayList<Integer>(i);
		sub=Arrays.asList(i.get(1),i.get(4));//i��1���� Ԫ�غ�4����Ԫ��
		System.out.println(i);
		System.out.println("sub:"+sub);
		copy.retainAll(sub);//����sub������Ԫ�ص�copy��
		System.out.println("13:"+copy);
		copy=new ArrayList<Integer>(i);//����i��copy
		copy.remove(2);
		System.out.println("14:"+copy);
		
	}
}
