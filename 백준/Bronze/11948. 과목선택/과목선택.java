import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int[] score = new int[6];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 6; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
	}

	static void pro() throws IOException {
		int sum = 0, max = 0, ans = 0;
		for(int i = 0; i < 4; i++) {
			sum += score[i];
		}
		
		for(int i = 0; i < 4; i++) {
			max = Math.max(max, sum - score[i]);
		}
		
		ans = max;
		ans += Math.max(score[4], score[5]);
		
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