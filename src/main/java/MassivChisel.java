/**
 * Author: Egor_Che
 * 19.10.2017
 * Aplana
 */

import java.io.IOException;
import java.util.*;

public abstract class MassivChisel {
    public static void main(String... args) throws IOException{
        Scanner input = new Scanner(System.in);
        //Создать массив упорядоченный
        int[] myArray = new int[20];
        int var = myArray.length;
        for (int i = 0; i < var; i++) {
            myArray[i] = i -10;
        }

        // перемешать числа
        Random rnd = new Random();
        for (int i = myArray.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i);
            int tmp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = tmp;
        }
        // вывести результат
        System.out.println("Массив заполнен: \n" + Arrays.toString(myArray));

        // поиск значений
        int minVal = myArray[0];
        int maxVal = 10;
        int positionOfSearch = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minVal && myArray[i] < 0){
                minVal = myArray[i];
                positionOfSearch = i+1;
            }
        }
        System.out.println("Максимальное отрицательное значение: " + minVal + " В позиции " + positionOfSearch);
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 1 && myArray[i] < maxVal){
                maxVal = myArray[i];
                positionOfSearch = i+1;
            }
        }
        System.out.println("Минимальное положительное значение: " + maxVal + " В позиции " + positionOfSearch);
    }
}
