//created on 19/07/2025

package objectOriented;

public abstract class AbstractRecipe {

	public void execute() {// one method to apply all methods.
		getReady();
		doDish();
		cleanUp();
	}

	abstract void getReady();

	abstract void doDish();

	abstract void cleanUp();
	// prepare
	// recipe
	// cleanup
}
