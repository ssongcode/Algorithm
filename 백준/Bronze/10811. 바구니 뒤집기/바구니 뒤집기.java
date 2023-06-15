import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int N, M;
	static int[] arr;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		stk();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
	}

	static void pro() throws IOException {
		arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}
		int a, b;
		for (int i = 0; i < M; i++) {
			stk();
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			swap(a, b);
		}
		for (int i = 1; i <= N; i++) {
			sb.append(arr[i]).append(blank);
		}
		System.out.println(sb);
	}

	public static void swap(int a, int b) {
		int mid = (a + b) / 2;
		int tmp;
		for (int i = a; i <= mid; i++) {
			tmp = arr[i];
			arr[i] = arr[a + b - i];
			arr[a + b - i] = tmp;
		}
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}