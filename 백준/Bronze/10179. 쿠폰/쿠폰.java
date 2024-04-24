import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int T;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
	}

	static void pro() throws IOException {
		double price;
		String num = "";
		
		for(int i = 0; i < T; i++) {
			price = Double.parseDouble(br.readLine());
			price *= 0.8;
			num = String.format("%.2f", price);
			sb.append("$").append(num).append(endl);
		}
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