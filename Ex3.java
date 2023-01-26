// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом 
// (возвращает boolean значение).

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scString.nextLine();
        scString.close();
        boolean result = false;
        for (int i = 0; i < (str.length() - 1) / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1)) {
                result = true;
            }
        }
        System.out.println(result);
    }

}
