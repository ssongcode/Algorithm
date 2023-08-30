import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static BufferedReader br;

    static String endl = "\n";
    static String blank = " ";

    static int T;
    static int K, N; // K층, N호
    static int[][] people;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            K = Integer.parseInt(br.readLine());
            N = Integer.parseInt(br.readLine());
            pro();
        }
    }

    static void pro() throws IOException {
        people = new int[15][15];
        for (int i = 1; i <= N; i++) {
            people[0][i] = i;
        }
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                people[i][j] = people[i][j - 1] + people[i - 1][j];
            }
        }
        System.out.println(people[K][N]);
    }

    public static void main(String[] args) throws IOException {
        input();
    }

    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }

}