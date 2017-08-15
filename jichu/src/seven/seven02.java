package seven;

class Cleaner{
	private String s="Cleaner";
	public void append(String a){
		s+=a;
	}
	public void dilute(){
		append("dilute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args) {
		Cleaner x=new Cleaner();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class seven02 extends Cleaner{
	public void scrub(){
		append("seven02.scrub()");
		super.scrub();
	}
	public void foam(){
		append("   foam()");
		
	}
	public static void main(String[] args) {
		seven02 x=new seven02();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("≤‚ ‘∏∏¿‡:");
		Cleaner.main(args);
	}
}