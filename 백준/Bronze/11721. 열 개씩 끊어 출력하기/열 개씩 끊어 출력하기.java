import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";
	
	static String word;
	
	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine();
	}

	static void pro() throws IOException {
		int len = word.length();
		int cnt = len / 10;
		int mod = len % 10;
		
		String tmp = null;
		int idx = 0;
		if(len < 10) tmp = word;
		for (int i = 0; i < cnt; i++) {
			tmp = word.substring(idx, idx + 10);
			idx += 10;
			sb.append(tmp).append(endl);
		}
		tmp = word.substring(idx, idx + mod);
		sb.append(tmp);
		System.out.println(sb.toString());
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}