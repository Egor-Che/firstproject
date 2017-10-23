package newyear;

public class Nougat extends Candy {
    private String nuts;

    public Nougat(long pcs, String type, double weight, double price, String nuts) {
        super(pcs, type, weight, price);
        this.nuts = nuts;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    @Override
    public String toString() {
        return super.toString() + ", Начинка: " + nuts;
    }

}
