import java.util.*;

public class rangeAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rangeAlgorithm ob = new rangeAlgorithm();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int N = in.nextInt();
		in.close();
		int[] input = new int[N];
		int max = 100;
		int min = 0;
		Random randomNum = new Random();
		for (int i = 0; i < N; i++) {
			input[i] = min + randomNum.nextInt(max);
		}
		long startTime = 0;
		long stopTime = 0;
		
//		System.out.println("First algorithm: ");
//		startTime = System.nanoTime();
//		int result1 = ob.range1(input);
//		stopTime = System.nanoTime();
//		long elapsedTime1 = (stopTime - startTime) / 1000000;
//		System.out.println("Time elapsed: " + elapsedTime1 + " ms.");
//		System.out.println("Result = " + result1);
//		System.out.println();
//		
//		System.out.println("Second algorithm: ");
//		startTime = System.nanoTime();
//		int result2 = ob.range2(input);
//		stopTime = System.nanoTime();
//		long elapsedTime2 = (stopTime - startTime) / 1000000;
//		System.out.println("Time elapsed: " + elapsedTime2 + " ms.");
//		System.out.println("Result = " + result2);
//		System.out.println();
		
		System.out.println("Third algorithm: ");
		startTime = System.nanoTime();
		int result3 = ob.range3(input);
		stopTime = System.nanoTime();
		long elapsedTime3 = (stopTime - startTime) / 1000000;
		System.out.println("Time elapsed: " + elapsedTime3 + " ms.");
		System.out.println("Result = " + result3);
	}
	
	public int range1(int[] input) {
		int maxDiff = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				int diff = Math.abs(input[j] - input[i]);
				if (diff > maxDiff) {
					maxDiff = diff;
				}
			}
		}
		return maxDiff;
	}
	
	public int range2(int[] input) {
		int maxDiff = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				int diff = Math.abs(input[j] - input[i]);
				if (diff > maxDiff) {
					maxDiff = diff;
				}
			}
		}
		return maxDiff;
	}
	
	public int range3(int[] input) {
		int max = input[0];
		int min = max;
		for (int i = 1; i < input.length; i++) {
			int n = input[i];
			if (n < min) {
				min = n;
			}
			if (n > max) {
				max = n;
			}
		}
		return max - min;
	}

}
