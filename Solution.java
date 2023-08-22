import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), x = fs.nextInt(), k = fs.nextInt(), p = fs.nextInt();
			p += Math.min(k, x) * 10;
			p += (k - Math.min(k, x)) * 5;
			if (n == k) {
				p += 20;
			}
			System.out.println(p);
		}
		fs.close();
	}
}
