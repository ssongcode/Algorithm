import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int x, y;
	static int[] xCnt = new int[1001];
	static int[] yCnt = new int[1001];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			stk();
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			xCnt[x]++;
			yCnt[y]++;
		}
	}

	static void pro() throws IOException {
		for (int i = 1; i <= 1000; i++) {
			if (xCnt[i] == 1)
				x = i;
			if (yCnt[i] == 1)
				y = i;
		}
		System.out.println(x + blank + y);

	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}