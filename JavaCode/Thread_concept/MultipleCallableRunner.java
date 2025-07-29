//created on 29/07/2025

package threadsconcept;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// execute is used for non returning types

		List<CallableTask> tasks = List.of(new CallableTask("charan"), new CallableTask("ajay"),
				new CallableTask("gopal"), new CallableTask("venu"));

		List<Future<String>> results = executorService.invokeAll(tasks);

		for (Future<String> result : results) {
			System.out.println(result.get());
		}

		executorService.shutdown();
	}
}
//output

//Hello charan

//Hello ajay

//Hello gopal

//Hello venu
