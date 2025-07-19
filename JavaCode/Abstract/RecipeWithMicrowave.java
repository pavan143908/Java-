//created on 19/07/2025

package objectOriented;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doDish() {
		System.out.println("get stuff ready");
		System.out.println("put it on the microwave");

	}

	@Override
	void cleanUp() {
		System.out.println("cleanup  the utensils");
		System.out.println("Swith Off the microwave");

	}

}
