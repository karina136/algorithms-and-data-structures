package Task10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = sc.nextLine();
        name = name.toLowerCase(Locale.ROOT);
        char letter = name.charAt(0);
        letter = Character.toUpperCase(letter);
        System.out.printf("Привет, " + letter + name.substring(1, name.length()) + "!");
    }
}
