
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой 
//итерации запишите в лог-файл.
import java.io.FileWriter;
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
        int count=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                    count++;
                    // массив переводим в строку
            StringBuilder builder = new StringBuilder();
            for (int k : arr) {
                builder.append(k);
            }
            String text = builder.toString();
            // логирование
            try (FileWriter writer = new FileWriter("notes3.txt", true)) {
                writer.append(count+"-я итерация: ");
                writer.write(text);
                writer.append('\n');                

                writer.flush();
            } catch (Exception e) {

                System.out.println("что-то не так");
            }

                }
            }            
        }

        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < razmernost; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
