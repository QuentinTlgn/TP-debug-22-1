package tptests;

public class fizzbuzz {
	public static String fizzBuzz(int i) {
		if(i%3 == 0 && i!=0) {
			return "Fizz";
		}
		return Integer.toString(i);
	}
	
}
