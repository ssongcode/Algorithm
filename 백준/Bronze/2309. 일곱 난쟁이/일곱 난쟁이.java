import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int height[] = new int[9];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < height.length; i++) {
			height[i] = Integer.parseInt(br.readLine());
		}
	}

	static void pro() throws IOException {
		int[] ans = new int[7];
		for (int a = 0; a < 9; a++) {
			for (int b = a + 1; b < 9; b++) {
				for (int c = b + 1; c < 9; c++) {
					for (int d = c + 1; d < 9; d++) {
						for (int e = d + 1; e < 9; e++) {
							for (int f = e + 1; f < 9; f++) {
								for (int g = f + 1; g < 9; g++) {
									if(height[a] + height[b] + height[c] + height[d] + height[e] + height[f] + height[g] == 100) {
										ans[0] = height[a];
										ans[1] = height[b];
										ans[2] = height[c];
										ans[3] = height[d];
										ans[4] = height[e];
										ans[5] = height[f];
										ans[6] = height[g];
									}
								}
							}
						}
					}
				}
			}
		}
		
		Arrays.sort(ans);
		for (int i = 0; i < 7; i++) {
			System.out.println(ans[i]);
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