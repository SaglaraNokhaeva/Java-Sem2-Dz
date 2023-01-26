
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой 
//итерации запишите в лог-файл.
import java.sql.Array;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите разменость массива: ");
        int razmernost = input.nextInt();
        int arr[] = new int[razmernost];
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < razmernost; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < razmernost; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        // сортировка
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < razmernost; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
