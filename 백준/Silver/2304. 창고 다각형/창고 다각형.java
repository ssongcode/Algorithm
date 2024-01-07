import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int n;
	static int[] arr = new int[1002];
	static int[] prefix = new int[1002];
	static int[] suffix = new int[1002];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			stk();
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x] = y;
		}
	}

	static void pro() throws IOException {
		// x 좌표가 i 이하인 위치에서 가장 높은 기둥의 높이
		prefix[0] = 0;
		for (int i = 1; i <= 1000; i++) {
			prefix[i] = Math.max(prefix[i - 1], arr[i]);
		}
		// x 좌표가 i 이상인 위치에서 가장 높은 기둥의 높이
		suffix[1001] = 0;
		for (int i = 1000; i >= 0; i--) {
			suffix[i] = Math.max(suffix[i + 1], arr[i]);
		}
		int ans = 0;
		for (int i = 1; i <= 1000; i++) {
			ans += Math.min(prefix[i], suffix[i]);
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
