import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int X;
	static int[] arr = new int[5000];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		X = Integer.parseInt(br.readLine());
	}

	static void pro() throws IOException {
		int idx = 0;
		boolean flag = false;
		for (int i = 1; i < 5000; i++) {
			arr[i] += arr[i - 1] + i;
		}
		
		for (int i = 1; i < 5000; i++) {
			if (arr[i] >= X) {
				idx = i;
				break;
			} 
		}
		if (idx % 2 == 0) flag = true;
		X -= arr[idx - 1];
		if (flag) sb.append(X).append("/").append(idx + 1 - X);
		else sb.append(idx + 1 - X).append("/").append(X);
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