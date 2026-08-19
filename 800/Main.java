import java.io.*;
import java.util.*;

public class Main {

    // ---------- FAST SCANNER ----------
    static class FastScanner {
        private final BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int a=fs.nextInt();
        String b = "I hate ";
        while(a>1){
            if(a%2==0){
                b+="that I love ";
            }
            else {
                b+="that I hate ";
            }
            a--;
        }
        b+="it";
        System.out.println(b);
    }
}