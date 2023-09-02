import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";
	
	static int[][] arr = new int [10][10];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		for (int r = 1; r < 10; r++) {
			stk();
			for (int c = 1; c < 10; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
	}

	static void pro() throws IOException {
		int max = 0;
		int R = 0, C = 0;
		for (int r = 1; r < 10; r++) {
			for (int c = 1; c < 10; c++) {
				if (arr[r][c] >= max) {
					max = arr[r][c];
					R = r;
					C = c;
				}
			}
		}
		sb.append(max).append(endl).append(R).append(blank).append(C);
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