package newyear;

public class Rubber extends Candy {
    private String rubber;

    public Rubber(long pcs, String type, double weight, double price, String rubber) {
        super(pcs, type, weight, price);
        this.rubber = rubber;
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Особенность: " + rubber;
    }

}
