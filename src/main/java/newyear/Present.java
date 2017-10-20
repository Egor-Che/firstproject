/**
 * Author: Egor_Che
 * 20.10.2017
 * Aplana
 */

package newyear;

import java.util.List;

public class Present {

    private final List<Candy> candies;

    public Present(List<Candy> candies) {
        this.candies = candies;
        System.out.println("Содержимое подарка: ");
    }

    public void open(){
        for (Candy candy : candies) {
            System.out.println(candy);
        }
    }

    public void showWeight(){
        double totalWeight = 0;
        for (Candy candy : candies) {
            totalWeight += (candy.getWeight() * candy.getPcs());
        }
        System.out.print("Вес подарка: ");
        System.out.printf("%.3f", totalWeight);
        System.out.print(" кг\n");
    }

    public void showPrice(){
        double totalPrice = 0;
        for (Candy candy : candies) {
            totalPrice += (candy.getPrice() * candy.getPcs());
        }
        System.out.print("Стоимость подарка: ");
        System.out.printf("%.2f", totalPrice);
        System.out.print(" руб.\n");
    }
}
