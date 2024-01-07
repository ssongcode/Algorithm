import java.util.*;
import java.io.*;

public class Main {
	static String str;
	static boolean[] arr = new boolean[10];
	public static boolean judge(int num) {
		Arrays.fill(arr, false);
		int mod = 0;
		while (num != 0) {
			mod = num % 10;
			if (arr[mod] == true) {
				return false;
			}
			arr[mod] = true;
			num /= 10;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[1_000_001];
		for (int i = 1; i <= 10; i++) {
			arr[i] = i;
		}
		int j = 11;
		for (int i = 11; i <= 1000000; i++) {
			while (!judge(j)) {
				j++;
			}
			arr[i] = j++;
		}
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			else {
				System.out.println(arr[n]);
			}
		}
		
	}
}
