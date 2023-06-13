import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";
	
	static int N;
	
	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
	}

	static void pro() throws IOException {
		int ans = 0;
		if(N == 0) ans = 0;
		else if(N == 1) ans = 1;
		else {
			int[] dp = new int[21];
			dp[0] = 0;
			dp[1] = 1;
			for (int i = 2; i <= 20; i++) {
				dp[i] = dp[i-2] + dp[i-1];
			}
			ans = dp[N];
		}
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