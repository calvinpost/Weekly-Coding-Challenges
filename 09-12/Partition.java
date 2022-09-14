import java.util.Arrays;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] parts = { 
				{ 2, 8, 4, 1 }, 
				{ -1, -10, 1, -2, 20 }, 
				{ -1, -20, 5, -1, -2, 2 } 
				};
		for(int[] part: parts) {
			System.out.println(Arrays.toString(part) + " : " + canPartition(part));
		}
	}

	public static boolean canPartition(int[] a) {
		int prod = 1;
		for (int i : a) {
			prod *= i;
		}
		for (int i : a) {
			if (prod / i == i)
				return true;
		}
		return false;
	}

}
