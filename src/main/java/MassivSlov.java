import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MassivSlov {
    public static void run(String[] args) throws IOException {
        Scanner input = new Scanner(in);
        int dlinaMassiva;
        out.println("Задайте количество слов в массиве");
        dlinaMassiva = input.nextInt();
        String[] massivSlov = new String[dlinaMassiva];
        out.println("Введите слова, по одному с новой строки");
        for (int i = 0; i < massivSlov.length; i++) {
            massivSlov[i] = input.next();
        }
        out.print("Вы ввели " + dlinaMassiva + " слов(а): ");
        for (int i = 0; i < massivSlov.length; i++) {
            out.print(massivSlov[i] + " ");
        }
        int iMax = -1, iMaxLength = -1;
        for (int i = 0; i < massivSlov.length; i++) {
            if (!"".equals(massivSlov[i]) && massivSlov[i].length() > iMaxLength) {
                iMax = i;
                iMaxLength = massivSlov[i].length();
            }

        }
        out.println("\n" + "Самое длинное слово: " + massivSlov[iMax]);
    }
}

