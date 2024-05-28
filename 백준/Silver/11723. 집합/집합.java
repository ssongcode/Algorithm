import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static BufferedReader br;

	static String endl = "\n";
	static String blank = " ";

	static int M;
	static List<Integer> list;

	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		M = Integer.parseInt(br.readLine());
	}

	static void pro() throws IOException {
		list = new ArrayList<Integer>();
		String str, process;
		int x;
		for (int i = 0; i < M; i++) {
			stk();
			process = st.nextToken();
			switch(process) {
			case "add":
				x = Integer.parseInt(st.nextToken());
				if (!list.contains(x))
					list.add(x);
				break;
			case "remove":
				x = Integer.parseInt(st.nextToken());
				if(list.contains(x))
					list.remove(Integer.valueOf(x));
				break;
			case "check":
				x = Integer.parseInt(st.nextToken());
				if (list.contains(x))
					sb.append(1).append(endl);
				else
					sb.append(0).append(endl);
				break;
			case "toggle":
				x = Integer.parseInt(st.nextToken());
				if (list.contains(x))
					list.remove(Integer.valueOf(x));
				else
					list.add(x);
				break;
			case "all":
				list = new ArrayList<Integer>();
				for (int j = 1; j <= 20; j++) {
					list.add(j);
				}
				break;
			case "empty":
				list = new ArrayList<Integer>();
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) throws IOException {
		input();
		pro();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}

}
