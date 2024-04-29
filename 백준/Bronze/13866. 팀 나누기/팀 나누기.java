import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int[] arr = new int[4];
	static int sum = 0;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		stk();
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
	}

	static void pro() throws IOException {
		int level1 = 0, level2 = 0;
		int min = 10000;
		
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				level1 = arr[i] + arr[j];
				level2 = sum - level1;
				
				min = Math.min(min, Math.abs(level1-level2));
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}