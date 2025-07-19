//created on 19/07/2025

package intefaceConceptsObjectOriented2;

public class SnakeGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("implements up action");
	}

	@Override
	public void down() {
		System.out.println("implements down action");
	}

	@Override
	public void left() {
		System.out.println("implements left action");
	}

	@Override
	public void right() {
		System.out.println("implements right action");
	}

}
