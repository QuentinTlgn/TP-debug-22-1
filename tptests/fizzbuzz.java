package tptests;

public class fizzbuzz {
	public static String fizzBuzz(int i) {
		if(i%3== 0 && i%5 == 0 && i!=0) {
			return "FizzBuzz";
		}
		if(i%3 == 0 && i!=0) {
			return "Fizz";
		}
		if(i%5 == 0 && i!=0) {
			return "Buzz";
		}
		return Integer.toString(i);
	}
	
}
