import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] time = new int[1001];
		int[][] lgtime = new int[N][2];
		int cnt = 0;
		int max = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			// 입력값을 계속 받아와야하기 때문에 반복문 안에서 읽어준다.
			// j for문 안으로 들어가면 j가 끝나기도 전에 또 입력값을 받아오므로 배열에 저장이 잘 되지 않는다.
			for (int j = 0; j < 2; j++) {
				lgtime[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			cnt = 0;
			Arrays.fill(time, 0);
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				// 일한 시간 1로 바꾸기
				for (int k = lgtime[j][0]; k < lgtime[j][1]; k++) {
					time[k] = 1;
				}
			}
			// 1로 바뀐 시간 카운팅
			for (int t = 0; t < 1001; t++) {
				if (time[t] == 1)
					cnt++;
			}
			// 제일 큰 값 찾기
			if (max < cnt)
				max = cnt;
		}

		System.out.println(max);

	}
}