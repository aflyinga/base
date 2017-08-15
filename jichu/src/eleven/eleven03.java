package eleven;

import java.awt.ItemSelectable;
import java.awt.List;
import java.util.ArrayList;


interface Selector{
	boolean end();
	Object current();
	void next();
}

class eleven03{
	private final ArrayList items=new ArrayList();
	
	public void add(Object x){
		items.add(x);
	}
	private class eleven03Selector implements Selector{
		private int i=0;
		
		public boolean end(){
			return i==items.size();
		}
		
		public Object current(){
			return items.get(i);
		}
		
		public void next(){
			if(i<items.size())
				i++;
		}
	}
	
	public Selector selector(){
		return new eleven03Selector();
	}
	
	public static void main(String[] args) {
		eleven03 e03=new eleven03();
		for(int i=0;i<10;i++){
			e03.add(Integer.toString(i));
		}
		Selector se=e03.selector();
		while(!se.end()){
			System.out.println(se.current()+"");
			se.next();
		}
			
	}
}
