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
		int n = 0;
		char ch = 0;
		Loop: for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 21; j++) {
				for (int k = 0; k < 28; k++) {
					n++;
					if (n == N) {
						ch = (char) (44032 + 21 * 28 * i + 28 * j + k);
						break Loop;
					}
				}
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}