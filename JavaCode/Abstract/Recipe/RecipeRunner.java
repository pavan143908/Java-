//created on 19/07/2025

package objectOriented;

public class RecipeRunner {

	public static void main(String[] args) {

		Recipe1 recipe = new Recipe1();
		recipe.execute();

		System.out.println("***********************");

		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();
	}

}

//output

//Get the raw materials
//Get the utensils
//Do the dish
//cleanup the utensils
//***********************
//Get the raw materials
//Switch on the microwave
//get stuff ready
//put it on the microwave
//cleanup  the utensils
//Swith Off the microwave
