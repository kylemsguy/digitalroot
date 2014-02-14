package digitalroot;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalRoot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		int next = 0;
		
		System.out.println("Please enter the numbers one at a time. Enter a number out of range to end. ");

		while (next > 0 && next < 10) {
			next = s.nextInt();
			
			numbers.add(next);
		}
		
		s.close();
	}
}