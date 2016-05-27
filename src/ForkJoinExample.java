import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class ForkJoinExample {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		
		pool.invoke(new RecursiveAction() {
			private static final long serialVersionUID = 1L;

			@Override
			protected void compute() {
				System.out.println("Hello");
			}
		});
	}
	
}
