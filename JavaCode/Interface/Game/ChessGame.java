//created on 19/07/2025

package intefaceConceptsObjectOriented2;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("implements an chess  up action");
	}

	@Override
	public void down() {
		System.out.println("implements an chess down action");
	}

	@Override
	public void left() {
		System.out.println("implements an chess left action");
	}

	@Override
	public void right() {
		System.out.println("implements an chess right action");
	}

}
