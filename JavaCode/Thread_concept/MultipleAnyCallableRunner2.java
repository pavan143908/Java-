//created on 29/07/2025

package threadsconcept;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// execute is used for non returning types

		List<CallableTask> tasks = List.of(new CallableTask("charan"), new CallableTask("ajay"),
				new CallableTask("gopal"), new CallableTask("venu"));

		// invokes only anyone of these list
		// using concept invokeAny(

		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();
	}
}
//output

//Hello ajay
