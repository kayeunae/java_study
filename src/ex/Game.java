package ex;

public class Game {
	String name;
	int hp;
	int att;
	int def;
	
	static int mp;
	
	Game(String name, int hp, int att) {
		this.name = name;
		this.hp = hp;
		this.att = att;
	}
	
	Game(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	Game() {}
	
	
	 static int attack(int x) {
		 Game myGame = new Game();
		 
		 return hp - x;
	 }
}
