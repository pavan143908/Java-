//Created on 27/07/2025

package functional_programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class SystemOUtConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}

class Square_Map_Function_screen implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

public class Lambda_Behind_The_Screens {

	public static void main(String[] args) {

		List.of(23, 43, 34, 24, 44, 45).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

		System.out.println("*******");

		List.of(23, 43, 34, 24, 44, 45).stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e));
//predicate of filter
// Stream<T> filter(Predicate<? super T> predicate);
// boolean test(T t);

		System.out.println("*******");

		List.of(23, 43, 34, 24, 44, 45).stream().filter(n -> n % 2 == 0).forEach(new SystemOUtConsumer());
//.forEach(e -> System.out.println(e))
// (Consumer<? super T> action);
// void accept(T t);

		System.out.println("*******");

		List.of(23, 43, 34, 24, 44, 45).stream().filter(n -> n % 2 == 0).map(new Square_Map_Function_screen())
				.forEach(e -> System.out.println(e));

		// .map(n -> n * n)
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);

		System.out.println("*******");
	}
}
//output

//34
//24
//44
//*******
//34
//24
//44
//*******
//34
//24
//44
//*******
//1156
//576
//1936
//*******