package seven;

public class seven06 extends BoardGame{
     public seven06() {
		super(11);
		System.out.println("seven06构造器");
	}
     public static void main(String[] args) {
		seven06 a=new seven06();
	}
}
class Game{
	Game(int i){
		System.out.println("Game构造器");
	}
}
class BoardGame extends Game{
	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame构造器");
	}
}
