import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";
	
	static int T, N;
	static int[] par;
	static boolean[] visited;
	
	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
	}

	static void pro() throws IOException {
		for (int tc = 0; tc < T; tc++) {
			N = Integer.parseInt(br.readLine());
			par = new int[N+1];
			visited = new boolean[N+1];
			int a, b;
			for (int i = 1; i < N; i++) {
				stk();
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				par[b] = a;
			}
			stk();
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			int parent = n1;
			while (true) {
				visited[parent] = true;
				if (par[parent] == 0) break;
				parent = par[parent];
			}
			parent = n2;
			while (true) {
				if (visited[parent]) {
					sb.append(parent).append(endl);
					break;
				}
				parent = par[parent];
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}