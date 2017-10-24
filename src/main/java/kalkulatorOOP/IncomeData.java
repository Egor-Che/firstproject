/*
 * Copyright (c) 2017.
 * Egor_Che
 */

package kalkulatorOOP;
import java.util.Scanner;

public abstract class IncomeData {
    Scanner input = new Scanner(System.in);
    double pervoeChislo = 0;
    double vtoroeChislo = 0;
    static double resultat = 0;
    String operator = "";
    String[] operators = {"+", "*", "-", "/"};

    double pervoeChislo = input.nextDouble();
    String operator = input.next();
    double vtoroeChislo = input.nextDouble();
}
