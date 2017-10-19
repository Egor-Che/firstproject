import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChooseProgram {
    public static void main(String... args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Введите цифру: 1 или 2 для выбора программы, или 0 для выхода");
        while (true) {
            int expression = 0;

            try {
                expression = input.nextInt();
            }catch(InputMismatchException err){
                System.out.println("Нефиг фигню писать!");
                continue;
            }
            switch (expression) {
                case 1:
                    System.out.println("Вы выбрали калькулятор");
                    Calculator.run(args);
                    break;
                case 2:
                    System.out.println("Вы выбрали массив слов");
                    MassivSlov.run(args);
                    break;
                case 0:
                    System.out.println("Вы вышли из программы");
                    System.exit(0);
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }
}

