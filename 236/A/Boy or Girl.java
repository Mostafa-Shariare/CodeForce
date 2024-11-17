import java.util.*;
public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Set<Character> uniques =new HashSet<>();

        for (int i = 0; i < name.length(); i++) {
            uniques.add(name.charAt(i));
        }

        if (uniques.size() % 2 == 0){
            System.out.println("CHAT WITH HER!\n");
        }else {
            System.out.println("IGNORE HIM!\n");
        }
        sc.close();

    }
}
