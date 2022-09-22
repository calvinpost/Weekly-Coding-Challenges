import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] T = new int[N][3];
		for(int i=0; i<N; i++) {
			T[i][0] = in.nextInt();
			T[i][1] = in.nextInt();
			T[i][2] = in.nextInt();
		}
		in.close();
		for(int[] i: T) {
			Arrays.sort(i);
			System.out.println(i[1]);
		}
	}

}
