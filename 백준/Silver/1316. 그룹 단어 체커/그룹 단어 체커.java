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
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			if(check(str)) cnt++;
		}
		System.out.println(cnt);
	}
	
	public static boolean check(String str) {
		boolean[] arr = new boolean[26];
		arr[str.charAt(0)-'a'] = true;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) continue;
			if(arr[str.charAt(i)-'a']) return false;
			else arr[str.charAt(i)-'a'] = true;
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