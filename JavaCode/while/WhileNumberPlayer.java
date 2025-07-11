package loopsStatements;

public class WhileNumberPlayer {

	private int number;

	public WhileNumberPlayer(int i) {
		this.number = i;
	}

	public void printSquareUptoLimit() {

		int j = 1;
		while (j * j <= number) {
			System.out.print(j * j + " ");// for limit=30,output would be 1 4 9 16 25
			j++;
		}
		System.out.println();

	}

	public void printCubesUptoLimit() {
		int j = 1;
		while (j * j * j <= number) {
			System.out.print(j * j * j + " ");// for limit=30,output would be 1 8 27
			j++;
		}
		System.out.println();

	}

}
