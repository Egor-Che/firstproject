package newyear;

public class Sharmel extends Candy {
    private String vozdushniy;

    public Sharmel(long pcs, String type, double weight, double price, String vozdushniy) {
        super(pcs, type, weight, price);
        this.vozdushniy = vozdushniy;
    }

    public String getVozdushniy() {
        return vozdushniy;
    }

    public void setVozdushniy(String vozdushniy) {
        this.vozdushniy = vozdushniy;
    }

    @Override
    public String toString() {
        return super.toString() + ", Марка: " + vozdushniy;
    }

}
