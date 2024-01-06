import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int to1 = sc.nextInt();
		int to2 = sc.nextInt();
		int to3 = sc.nextInt();
		int n = sc.nextInt();
		int to1_num, to2_num, to3_num = 0;
		int output = 0;
		
		for (to1_num = 0; to1_num <= n / to1; to1_num++) {
			for (to2_num = 0; to2_num <= n / to2; to2_num++) {
				for (to3_num = 0; to3_num <= n / to3; to3_num++) {
					if (to1 * to1_num + to2 * to2_num + to3 * to3_num == n) {
						output = 1;
					}
				}
			}
		}
		System.out.println(output);
	}
}