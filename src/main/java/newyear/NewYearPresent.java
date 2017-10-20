/**
 * Author: Egor_Che
 * 20.10.2017
 * Aplana
 */

package newyear;

import java.util.Arrays;
import java.util.List;

public class NewYearPresent {

    public static void main(String[] args) {
        Present present = new Present(getCandies());
        present.open();
        present.showWeight();
        present.showPrice();
    }

    private static List<Candy> getCandies() {
        return Arrays.asList(
                new Candy(14,"Леденец",0.02, 24.65),
                new Candy(20,"Зефир",0.015, 4.65),
                new Candy(8,"Ириска",0.03, 0.15),
                new Candy(5,"Нуга",0.06, 3.14)
        );
    }
}
