/**
 * Author: Egor_Che
 * 20.10.2017
 * Aplana
 */

package newyear;

public class Candy {

    private final long pcs;
    private final String type;
    private final double weight;
    private final double price;

    public Candy(long pcs, String type, double weight, double price) {
        this.pcs = pcs;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getPcs() {
        return pcs;
    }

    @Override
    public String toString() {
        return  "Тип сладости: " + type +
                ", Количество: " + pcs +
                ", Вес: " + weight +
                ", Цена за единицу: " + price;
    }
}
