//Created on 20/07/2025

package intefaceConceptsObjectOriented2;

public class project {
	public static void main(String[] args) {

		ComplexAlgorithm algorithm = new DummyAlgorithm();

		// ComplexAlgorithm algorithm = new RealAlgorithm(); output: 30

		System.out.println(algorithm.complexAlgorithm(10, 20));

	}
}

//200