import com.sun.istack.internal.FinalArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GoodSolution {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите несколько слов, каждое с новой строки и пропустите строку для вывода самого длинного слова");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new FinalArrayList<String>();
        String line;
        while(!"".equals(line = reader.readLine())) {
            list.add(line);
        }
        int maxLength = getMaxWord(list).length();
        for (String item : list) {
            if (item.length() == maxLength) {
                System.out.println(item);
            }
        }
    }

    private static String getMaxWord(List<String> list) {
        String max = "";
        for(String item : list) {
            if (item.length() >= max.length()) {
                max = item;
            }
        }
        return max;
    }
}
