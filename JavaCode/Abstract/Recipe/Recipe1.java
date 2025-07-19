//created on 19/07/2025

package objectOriented;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doDish() {
		System.out.println("Do the dish");
	}

	@Override
	void cleanUp() {
		System.out.println("cleanup the utensils");
	}

}
