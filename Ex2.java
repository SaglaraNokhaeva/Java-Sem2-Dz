// Дана json строка (читать из файла и сохранить в файл) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
// "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Если .txt
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        File f1 = new File("student.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String line;
            while ((line = br.readLine()) != null) {
                //сплитуем
                String[] words = line.split("\"фамилия\":\"|\",\"оценка\":\"|\",\"предмет\":\"|\"");
                //формируем новую строку по образцу    
                StringBuilder builder = new StringBuilder();
                builder.append("Студент ");
                builder.append(words[1]);
                builder.append(" получил ");
                builder.append(words[2]);
                builder.append(" по предмету ");
                builder.append(words[3]);
                builder.append(".");
                String text = builder.toString();
                System.out.println(text);
                //запись в файл
                FileWriter writer = new FileWriter("f2.txt", true);
                writer.write(text);
                writer.append('\n');
                writer.flush();
                writer.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
