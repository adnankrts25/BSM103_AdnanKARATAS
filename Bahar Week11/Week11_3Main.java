package odev;

public class Week11_3Main {

	public static void main(String[] args) {
		
		int hp=10;
		Week11_3 squirtle=new Week11_3(5);
		
		battle(squirtle,hp);
		System.out.println("Level"+squirtle.level+","+hp+"hp");
		
		hp= hp+squirtle.level;
		
		battle(squirtle,hp+1);
		
		System.out.println("Level"+squirtle.level+","+hp+"hp");

		

	}
	public static void battle(Week11_3 poke, int hp) {
		poke.level++;
		hp -= 5;
		System.out.println("Level" +poke.level+","+hp+ "hp");
	}

}
