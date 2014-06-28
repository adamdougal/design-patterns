package decorator;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    private static NumberFormat format = NumberFormat.getNumberInstance(Locale.UK);

    public static void main(String[] args) {

        format.setMinimumFractionDigits(2);

        Beverage darkRoast = new DarkRoast();
        System.out.println("Description: " + darkRoast.getDescription() + ". Cost: £" + format.format(darkRoast.cost()));

        Beverage darkRoastMocha = new Mocha(darkRoast);
        System.out.println("Description: " + darkRoastMocha.getDescription() + ". Cost: £" + format.format(darkRoastMocha.cost()));

        Beverage darkRoastMochaCream = new Cream(darkRoastMocha);
        System.out.println("Description: " + darkRoastMochaCream.getDescription() + ". Cost: £" + format.format(darkRoastMochaCream.cost()));
    }
}
