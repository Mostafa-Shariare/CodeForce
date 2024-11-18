
//https://codeforces.com/contest/214/problem/A
import java.util.*;

public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {

                if (i*i+j==n && i+j*j==m){
                    count++;
                }

            }
            
        }

        System.out.println(count);
    }
}
