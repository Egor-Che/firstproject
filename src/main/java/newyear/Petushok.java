package newyear;

public class Petushok extends Candy {
    private String palka;

    public Petushok(long pcs, String type, double weight, double price, String palka) {
        super(pcs, type, weight, price);
        this.palka = palka;
    }

    public String getPalka() {
        return palka;
    }

    public void setPalka(String palka) {
        this.palka = palka;
    }

    @Override
    public String toString() {
        return super.toString() + ", Название: " + palka;
    }

}
