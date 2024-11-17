
//https://codeforces.com/problemset/problem/231/A

import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[3];


        int result = 0;

        for (int i = 0; i < a ; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {

                arr[j] = sc.nextInt();

                if (arr[j]==1){
                    count++;
                }
            }

            if (count == 2 || count > 2){
                result ++;

            }
        }
        System.out.println(result);

    }
}
