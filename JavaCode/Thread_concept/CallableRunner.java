//created on 29/07/2025

package threadsconcept;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;

	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "\n Hello " + name;
	}

}

public class CallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);
		// execute is used for non returning types

		Future<String> welcomeFuture = executorService.submit(new CallableTask("charan"));
		// future is apromise

		// submit is used for returning a value

		System.out.print("\n new CallableTask(\"charan\") completed");

		String welcomeMessage = welcomeFuture.get();

		System.out.println(welcomeMessage);

		// System.out.println(welcomeFuture.get());

		System.out.print("\n Main completed");

	}
}
/*
 * new CallableTask("charan") completed Hello charan
 * 
 * Main completed
 */