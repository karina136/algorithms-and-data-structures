package Task13;

import java.util.Scanner;

public class Series {
    public static void GetResult() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало ряда, шаг, количество шагов: ");
        String[] stringArray = in.nextLine().split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        int start = intArray[0];
        int step = intArray[1];
        int times = intArray[2];
        int count = 0;
        while (count != times) {
            System.out.println(start);
            start += step;
            count += 1;
        }
    }
}
