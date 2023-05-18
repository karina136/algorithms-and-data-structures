package Task1_;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк: ");
        int rows = sc.nextInt();
        System.out.println("Введите число столбцов: ");
        int columns = sc.nextInt();


        int [][] matrix = new int[rows][columns];
        Random randomizer = new Random();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = randomizer.nextInt(1,10);
            }
        }
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонированная матрица: ");
        for (int i = 0; i < columns; i++){
            for (int j = 0; j < rows; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
