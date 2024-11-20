import java.util.*;

public class Twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];


            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }


            Arrays.sort(a);

            int maxScore = 0;


            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    maxScore++;
                    i++;
                }
            }

            // Output the result for the current test case
            System.out.println(maxScore);
        }
    }
}
