package tips_accesss_package1;

class Player {
	private String name;
	private static int count;

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public int getCount() {
		return count;
	}
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("mahi");
		System.out.println(player1.getCount());
		Player player2 = new Player("rohith");
		System.out.println(player2.getCount());

	}
}
//output

//1
//2
