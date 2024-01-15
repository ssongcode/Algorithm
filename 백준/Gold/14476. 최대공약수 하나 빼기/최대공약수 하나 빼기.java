import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int N;
	static long[] num;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		num = new long[N];
		stk();
		for (int i = 0; i < N; i++) {
			num[i] = Long.parseLong(st.nextToken());
		}
	}

	static void pro() throws IOException {
		long[] lgcd, rgcd;
		lgcd = new long[N];
		rgcd = new long[N];

		lgcd[0] = num[0];
		for (int i = 1; i < N; i++) {
			lgcd[i] = getGCD(lgcd[i - 1], num[i]);
		}
		rgcd[N - 1] = num[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			rgcd[i] = getGCD(rgcd[i + 1], num[i]);
		}
		long ans = 0, tmp = 0;
		long gcd = Long.MIN_VALUE;
		long max = Long.MIN_VALUE;
		// 중간에 하나 빼서 비교하기
		for (int i = 1; i < N - 1; i++) {
			tmp = getGCD(lgcd[i - 1], rgcd[i + 1]);
			if (num[i] % tmp != 0)
				gcd = tmp;
			if (max < gcd) {
				max = gcd;
				ans = num[i];
			}
		}
		// 처음 수, 마지막 수 뺐을 때랑 비교하기
		if (max < rgcd[1]) {
			if (num[0] % rgcd[1] != 0) {
				max = rgcd[1];
				ans = num[0];

			}
		}
		if (max < lgcd[N - 2]) {
			if (num[N - 1] % lgcd[N - 2] != 0) {
				max = lgcd[N - 2];
				ans = num[N - 1];
			}
		}

		if (max == Long.MIN_VALUE)
			System.out.println(-1);
		else
			System.out.println(max + " " + ans);
	}

	static long getGCD(long a, long b) throws IOException {
		long tmp;
		while (a % b != 0) {
			tmp = a % b;
			a = b;
			b = tmp;
		}
		return b;
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}