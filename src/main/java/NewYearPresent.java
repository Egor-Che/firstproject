

import java.io.IOException;

public class NewYearPresent {
    public static void main(String... args) throws IOException {
        class Sweety {
            String name;
            Double weight;
            Double price;
        }
        class Candy extends Sweety {
            private String color;
            // конструктор
            Candy(String n, Double w, Double p, String c) {
                name = n;
                weight = w;
                price = p;
                color = c; // цвет
            }
        }
        class Jellybean extends Sweety {
            private int radius;
            // конструктор
            Jellybean(String n, Double w, Double p, int r) {
                name = n;
                weight = w;
                price = p;
                radius = r; // радиус
            }
        }
        class Toffee extends Sweety {
            private int pieces;
            // конструктор
            Toffee(String n, Double w, Double p, int x) {
                name = n;
                weight = w;
                price = p;
                pieces = x; // количество штук
            }
        }
        class Gummy extends Sweety {
            private String flavor;
            // конструктор
            Gummy(String n, Double w, Double p, String f) {
                name = n;
                weight = w;
                price = p;
                flavor = f; // вкус
            }
        }
    }
}
