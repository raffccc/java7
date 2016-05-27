
public class Multicatch {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException | IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
}
