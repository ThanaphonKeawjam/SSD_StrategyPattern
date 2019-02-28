package Question1;

public class ThailandTax implements Tax{

    public double calculate(double purchase) {
        return purchase + (purchase*0.07);
    }
}
