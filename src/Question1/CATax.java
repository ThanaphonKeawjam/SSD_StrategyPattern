package Question1;

public class CATax implements Tax{

    public double calculate(double purchase) {
        return purchase + (purchase*0.075);
    }
}
