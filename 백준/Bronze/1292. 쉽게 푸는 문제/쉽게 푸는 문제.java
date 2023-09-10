import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int[] arr = new int[1010];
	static int A, B;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		stk();
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
	}

	static void pro() throws IOException {
		int idx = 1;
		int N = 1;
		
		while (idx != 1010) {
			for (int i = 1; i <= N; i++) {
				arr[idx] = N;
				idx++;
				if(idx == 1010) break;
			}
			N++;
		}
		
		int sum = 0;
		for (int i = A; i <= B; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}