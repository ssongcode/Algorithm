import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int[] cnt = new int[10];
	static int num;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
	}

	static void pro() throws IOException {
		while (num != 0) {
			cnt[num % 10]++;
			num /= 10;
		}

		int tmp = cnt[6] + cnt[9];
		if (tmp % 2 == 0) {
			cnt[6] = tmp / 2;
			cnt[9] = tmp / 2;
		} else {
			cnt[6] = tmp / 2 + 1;
			cnt[9] = tmp / 2 + 1;
		}

		int max = 0;
		for (int i = 0; i < 10; i++) {
			max = Math.max(max, cnt[i]);
		}

		System.out.println(max);
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}