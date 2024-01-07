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
		int[] arr = new int[1000001];
		int[] mod = new int[10];
		int tmp;
		boolean flag = true;

		int num = 1;
		for (int idx = 1; idx <= 1000000; idx++) {
			tmp = num;
			Arrays.fill(mod, 0);
			flag = true;
			while (tmp != 0) {
				if (mod[tmp % 10] == 1) {
					flag = false;
					break;
				}
				mod[tmp % 10] = 1;
				tmp /= 10;
			}
			if (flag)
				arr[idx] = num;
			else
				idx--;
			num++;
		}

		int n = 0;
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0)
				return;
			System.out.println(arr[n]);
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