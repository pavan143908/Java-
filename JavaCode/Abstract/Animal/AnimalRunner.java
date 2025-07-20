//Created on 20/07/2025

package abstractConceptsObjectOriented2_1;

public class AnimalRunner {

	public static abstract class Animal {
		public abstract void bark();

	}

	public static class Dog extends Animal {
		@Override
		public void bark() {
			System.out.println("Bow Bow");
		}

	}

	public static class Cat extends Animal {
		@Override
		public void bark() {
			System.out.println("Meow Meow");
		}

	}

	public static void main(String[] args) {
		Animal[] animal = { new Cat(), new Dog() };
		for (Animal ab : animal) {
			ab.bark();
		}

	}

}
// Meow Meow
// Bow Bow
