import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int N;
	static int[][] game;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		game = new int[N][3];
		for (int i = 0; i < N; i++) {
			stk();
			game[i][0] = Integer.parseInt(st.nextToken());
			game[i][1] = Integer.parseInt(st.nextToken());
			game[i][2] = Integer.parseInt(st.nextToken());
		}
	}

	static void pro() throws IOException {
		int cnt = 0, ans = 0;
		for (int i = 111; i <= 999; i++) {
			String num = String.valueOf(i);
			if (num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2) || num.charAt(1) == num.charAt(2))
				continue;
			if (num.charAt(0) == '0' || num.charAt(1) == '0' || num.charAt(2) == '0')
				continue;
			if (check(num))
				cnt++;
		}
		System.out.println(cnt);
	}

	static boolean check(String num) throws IOException {
		for (int i = 0; i < N; i++) {
			int s = 0, b = 0;

			String tmp = String.valueOf(game[i][0]);

			for (int j = 0; j < 3; j++) {
				if (num.contains(String.valueOf(tmp.charAt(j))))
					b++;
			}
			for (int j = 0; j < 3; j++) {
				if (num.charAt(j) == tmp.charAt(j)) {
					s++;
					b--;
				}
			}
			if (game[i][1] != s || game[i][2] != b)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}