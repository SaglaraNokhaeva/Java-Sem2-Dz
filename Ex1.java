// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Введите разменость массива: ");
        int razmernost =input.nextInt();
        int array []=new int[razmernost];
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < razmernost; i++) {
            array[i] = input.nextInt(); 
        }
        System.out.print ("Исходный массив: ");
        for (int i = 0; i < razmernost; i++) {
            System.out.print (" " + array[i]); 
        }
        System.out.println();
    }
}
