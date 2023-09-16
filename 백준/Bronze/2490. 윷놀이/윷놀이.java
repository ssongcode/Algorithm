import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int[][] arr = new int[3][4];
	static int front, back;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			stk();
			for (int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}

	static void pro() throws IOException {
		for (int i = 0; i < 3; i++) {
			front = 0; back = 0;
			for (int j = 0; j < 4; j++) {
				if (arr[i][j] == 1) back++;
				else front++;
			}
			System.out.println(result(front, back));
		}
	}
	
	public static String result(int front, int back) {
		String result = null;
		if(front == 1 && back == 3) result = "A";
		else if(front == 2 && back == 2) result = "B";
		else if(front == 3 && back == 1) result = "C";
		else if(front == 4) result = "D";
		else if(back == 4) result = "E";
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}