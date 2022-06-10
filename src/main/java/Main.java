public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        MarketApi marketApi = new MarketApi();
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);

        Calculator calculator = new Calculator(new KrwCalculator());
        System.out.println(calculator.sum(1,5));
    }
}
