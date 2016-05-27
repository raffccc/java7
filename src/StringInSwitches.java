
public class StringInSwitches {

	public static void main(String[] args) {
		String name = "foo";
		
		switch (name) {
		case "bar":
			System.out.println("Hey!");
			break;
		case "foo":
			System.out.println("It is supposed to enter here!");
			break;
		default:
			break;
		}
	}
	
}
