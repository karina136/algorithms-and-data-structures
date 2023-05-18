package Task15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClearLine {
    public static void Clear() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String[] stringArray = in.nextLine().split(" ");
        Set<String> stringNewWordsArray = new HashSet<>(Arrays.asList(stringArray));
        System.out.println(stringNewWordsArray);
    }
}
