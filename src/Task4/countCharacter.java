package Task4;

import java.util.Scanner;

public class countCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println("Введите символ: ");
        char symbol = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(symbol == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Количество вхождений символа " + symbol + " в строку " + str + ":" + count);
    }
}
