import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";
	

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	static void pro() throws IOException {
		while(true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(str);
		}
	}
	

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}