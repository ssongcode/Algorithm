/* 창고 다각형
 * prefix[i] : 좌표가 i 이하인 위치에서 가장 높은 기둥의 높이
 * suffix[i] : 좌표가 i 이상인 위치에서 가장 높은 기둥의 높이
 * 구해서 최솟값
 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 기둥 개수 n개 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 배열에 좌표 입력
		int[] arr = new int[1002];
		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x] = y;
		}

		// x 좌표가 i 이하인 위치에서 가장 높은 기둥의 높이
		int[] prefix = new int[1002];
		prefix[0] = 0;
		for (int i = 1; i <= 1000; i++) {
			prefix[i] = Math.max(prefix[i - 1], arr[i]);
		}

		// x 좌표가 i 이상인 위치에서 가장 높은 기둥의 높이
		int[] suffix = new int[1002];
		suffix[1001] = 0;
		for (int i = 1000; i >= 0; i--) {
			suffix[i] = Math.max(suffix[i + 1], arr[i]);
		}

		// 가장 작은 창고 다각형의 면적
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += Math.min(prefix[i], suffix[i]);
		}

		System.out.println(sum);

	}

}