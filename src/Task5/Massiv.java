package Task5;

import java.util.Scanner;

public class Massiv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();

        int [] array = new int[size];
        int sum = 0;

        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < size; i++){
            array [i] = sc.nextInt();
            sum += array[i]*array[i];
        }

        System.out.println("Массив чисел и сумма квадратов всех чисел: ");
        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(" ⇒ " + sum);



    }
}
