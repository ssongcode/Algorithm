import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String endl = "\n";
    static String blank = " ";

    static int a, b;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        stk();
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    static void pro() throws IOException {
        if (a > b)
            System.out.print(">");
        else if (a == b)
            System.out.print("==");
        else
            System.out.print("<");
    }

    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }

}
