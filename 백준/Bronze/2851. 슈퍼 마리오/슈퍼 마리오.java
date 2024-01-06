import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int score[] = new int[10];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
	}

	static void pro() throws IOException {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < 10; i++) {
			sum += score[i];
			if (sum >= 100) {
				if (Math.abs(sum - 100) > Math.abs(sum - score[i] - 100))
					ans = sum - score[i];
				else
					ans = sum;
				break;
			}
			else ans = sum;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}