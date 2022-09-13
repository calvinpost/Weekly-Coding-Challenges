import java.util.Arrays;

public class LargestGap {

	public static void main(String[] args) {
		int N = 5;
		int[] arr = {-3, -1, 6, 7, 0};
		
		System.out.println(largestGap(arr));
	}
	
	public static int largestGap(int[] arr) {
		Arrays.sort(arr);
		return Math.abs(arr[0] - arr[arr.length-1]);
	}
}
