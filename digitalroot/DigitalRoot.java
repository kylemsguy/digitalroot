package digitalroot;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalRoot {
	private int start;
	public DigitalRoot(int start[]){
		this.start = sum(start);
	}

	public int getRoot(){
		return calcRoot(start);
	}

	private int sum(int ary[]){
		int total = 0;
		for(int i : ary){
			total += i;
		}
		return total;
	}

	private static int sumDigits(int num){
		int sum = 0;
		String strNum = Integer.toString(num);
		for(int i = 0; i < startDigits.length(); i++){
			sum += String.parseInt(strNum[i]);
		}
		return sum;
	}

	private static int calcRoot(int start){
		String startDigits = Integer.toString(start);
		if(startDigits.length() > 1){
			return calcRoot(sumDigits(start));
		}
		else{
			return start;
		}
	}

	public static void main(String[] args) {
		DigitalRoot dr = new DigitalRoot();
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		int next = 0;

		System.out.println("Please enter the numbers one at a time. Enter a number out of range to end. ");

		while (next > 0 && next < 10) {
			next = s.nextInt();

			numbers.add(next);
		}

		s.close();

		System.out.println()
	}
}
