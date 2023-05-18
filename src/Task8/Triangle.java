package Task8;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (checkExistence(a, b, c)) {
            System.out.println("Самый большой внешний угол = " + outsideCorner(a, b, c));
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }

    public static boolean checkExistence(int a, int b, int c) {
        return ((a < b + c) && (b < a + c) && (c < b + a));
    }

    public static double outsideCorner(int a, int b, int c) {
        double[] array = new double[3];

        array[0] = Math.toDegrees(Math.cos(((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c))));
        array[1] = Math.toDegrees(Math.cos(((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))));
        array[2] = Math.toDegrees(Math.cos(((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b))));

        return 180 - Arrays.stream(array).min().getAsDouble();
    }
}
