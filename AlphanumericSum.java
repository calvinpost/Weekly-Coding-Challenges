import java.util.Scanner;

public class AlphanumericSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if(in.hasNextLine()) {
			in.nextLine();
		}
		String[] S = new String[T];
		for(int i=0; i<T; i++) {
			S[i] = in.nextLine();
		}
		in.close();
		for(String s: S) {
			int sum = 0;
			for(char c: s.toCharArray()) {
				if(c > 47 && c < 58) sum += c-48;
			}
			System.out.println(sum);
		}
	}

}
