import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int a, b, c, d;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		stk();
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		stk();
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
	}

	static void pro() throws IOException {
		int ans = 0;
		ans = Math.min(a+d, b+c);
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