import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";
	
	static int N;
	static int[][] people;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		people = new int[N][2];
		for (int i = 0; i < N; i++) {
			stk();
			people[i][0] = Integer.parseInt(st.nextToken());
			people[i][1] = Integer.parseInt(st.nextToken());
		}
	}

	static void pro() throws IOException {
		int[] grade = new int[N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(j == i) continue;
				if(people[j][0] > people[i][0] && people[j][1] > people[i][1]) grade[i]++;
			}
		}
		for (int i = 0; i < N; i++) {
			grade[i]++;
			System.out.print(grade[i] + " ");
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