package eleven;

import java.util.*;

import five.staticInitialization;

public class eleven07 {
	
		public static void main(String[] args) {
			Dog arr[]=new Dog[10];
			for(int a=0;a<arr.length;a++){
				arr[a]=new Dog();
			}
	      List<Dog> dog=new ArrayList<Dog>(Arrays.asList(arr));//������תΪlist
	      System.out.println("dog="+dog);
	      List<Dog> subset=dog.subList(dog.size()/4, dog.size()/2);
	      System.out.println("subset="+subset);
	      subset.clear();
	      System.out.println("dog="+dog);
		}//����asList������subList�������ز��ɱ��б���Ϊ���Ƿֱ��ɵײ�������б�֧�֡���
}
class Dog{
	private static int ID;
	private int i=ID++;
	public String toString(){
		return "IDDog"+i;
	}
}