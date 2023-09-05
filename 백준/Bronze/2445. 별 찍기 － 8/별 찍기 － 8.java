import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int N;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
	}

	static void pro() throws IOException {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			for (int j = 2 * (N - i); j >= 1; j--) {
				sb.append(blank);
			}
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append(endl);
		}
		for (int i = N - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			for (int j = 1; j <= 2 * (N - i); j++) {
				sb.append(blank);
			}
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append(endl);
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}