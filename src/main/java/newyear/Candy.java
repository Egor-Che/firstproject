/**
 * Author: Egor_Che
 * 20.10.2017
 * Aplana
 */

package newyear;

public class Candy {

    private final long pcs;
    private final String name;
    private final double weight;
    private final double price;
//    private final String color;

    public Candy(long pcs, String name, double weight, double price) {
        this.pcs = pcs;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
/*
    public String Jellybean extends Candy (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
*/
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
        return  "Название: " + name +
                ", Количество: " + pcs +
                ", Вес: " + weight +
                ", Цена за единицу: " + price;
    }
}
