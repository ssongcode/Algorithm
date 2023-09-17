import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int N;
	static int[] num;
	static int[] cnt = new int[4001];
	static int[] mCnt = new int[4001];

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
	}

	static void pro() throws IOException {
		Arrays.sort(num);
		System.out.println(avg());
		System.out.println(mid());
		System.out.println(mode());
		System.out.println(range());
	}
	
	static int avg() {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += num[i];
		}
		double avg = Math.round((double)sum / N);
		return (int)avg;
	}
	
	static int mid() {
		int idx = num.length / 2;
		return num[idx];
	}
	
	static int mode() {
		for (int i = 0; i < N; i++) {
			if (num[i] >= 0) cnt[num[i]]++; 
			else mCnt[Math.abs(num[i])]++;
		}
		int tmp = 0;
		int max = 0; // 가장 많이 나온 값의 개수
		for (int i = 0; i <= 4000; i++) {
			if(cnt[i] >= max) {
				max = cnt[i];
				tmp = i;
			}
			if(mCnt[i] >= max) {
				max = mCnt[i];
				tmp = -i;
			}
		}
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i <= 4000; i++) {
			if(cnt[i] == max) {
				list.add(i);
				count++;
			}
			if(mCnt[i] == max) {
				list.add(-i);
				count++;
			}
		}
		Collections.sort(list);
		if (count >= 2) return list.get(1);
		return list.get(0);
		
	}
	
	static int range() {
		return num[N-1] - num[0];
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}