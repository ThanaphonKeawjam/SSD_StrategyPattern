package Question1;

public class Main {

    public static void main(String[] args) {
        CashRegister registerNopattern = new CashRegister();

        registerNopattern.recordPurchase(60);
        registerNopattern.recordPurchase(40);

        registerNopattern.setTax(new ThailandTax());
        registerNopattern.calTax();

        registerNopattern.enterPayment(200);

        double change = registerNopattern.giveChange();
        System.out.println(change);

    }

}
