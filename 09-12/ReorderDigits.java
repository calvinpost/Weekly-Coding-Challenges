import java.util.Arrays;
import java.util.Comparator;

public class ReorderDigits {

	public static void main(String[] args) {
		int[][] arr = {
				{ 515, 341, 98, 44, 211 },
				{ 63251, 78221 },
				{ 1, 2, 3, 4 }
		};
		for(int[] a: arr) {
			System.out.println(Arrays.toString(a) + ",  asc: " + reorderDigits(a, "asc"));
			System.out.println(Arrays.toString(a) + ", desc: " + reorderDigits(a,"desc"));
		}
	}

	public static String reorderDigits(int[] a, String s) {
		int[] b = a.clone();
		for(int i=0; i<b.length; i++) {
			int n = b[i];
			char[] chars = Integer.toString(n).toCharArray();
			Arrays.sort(chars);
			StringBuilder res = new StringBuilder();
			res.append(chars);
			if(s.equals("desc")) {
				res = res.reverse();
			}
			b[i] = Integer.parseInt(res.toString());
		}
		return Arrays.toString(b);
	}
}
