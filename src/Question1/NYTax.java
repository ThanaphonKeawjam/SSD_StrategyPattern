package Question1;

public class NYTax implements Tax {

    public double calculate(double purchase) {
        if (purchase > 100)
            return purchase + (purchase*0.08);

        return 0;
    }
}
