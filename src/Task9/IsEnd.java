package Task9;

import java.util.Scanner;

public class IsEnd {
    public static boolean IsEnd() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String[] first = in.nextLine().split("");
        System.out.println("Введите вторую строку: ");
        String[] last = in.nextLine().split("");
        boolean isError = false;
        int j = first.length - 1;
        for (int i = last.length - 1; i > 0; i--) {
            if (!first[j].equals(last[i])) {
                return false;
            }
            j -= 1;
        }
        return true;
    }
}
