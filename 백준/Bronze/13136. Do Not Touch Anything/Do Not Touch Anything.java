import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int R, C, N;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		stk();
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
	}

	static void pro() throws IOException {
		int r = 0, c = 0;
		long ans = 0;

		if (R % N == 0)
			r = R / N;
		else
			r = R / N + 1;
		if (C % N == 0)
			c = C / N;
		else
			c = C / N + 1;
		
		ans = (long)r * c;
		
		System.out.println(ans);
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}