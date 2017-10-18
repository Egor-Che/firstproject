import java.io.IOException;
import java.util.Scanner;

public class MassivSlov {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int dlinaMassiva;
        System.out.println("Задайте количество слов в массиве");
        dlinaMassiva = input.nextInt();
        String[] massivSlov = new String[dlinaMassiva];
        System.out.println("Введите слова, по одному с новой строки");
        for (int i = 0; i < massivSlov.length; i++) {
            massivSlov[i] = input.next();
        }
        System.out.print("Вы ввели " + dlinaMassiva + " слов(а): ");
        for (int i = 0; i < massivSlov.length; i++) {
            System.out.print(massivSlov[i] + " ");
        }
        int iMax = -1, iMaxLength = -1;
        for (int i = 0; i < massivSlov.length; i++) {
            if (!"".equals(massivSlov[i]) && massivSlov[i].length() > iMaxLength) {
                iMax = i;
                iMaxLength = massivSlov[i].length();
            }

        }
        System.out.println("Самое длинное слово: " + massivSlov[iMax]);
    }
}
//changes
