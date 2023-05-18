package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ответы программы о проходе людей через турникет");
        Scanner scanner1 = new Scanner(System.in);
        String usersText = scanner1.nextLine();
        Workers workers = new Workers(usersText);
        System.out.println("На работу пришло " + workers.sumWorkers() + " Человек");
    }
}
