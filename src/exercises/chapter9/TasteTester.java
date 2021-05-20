package exercises.chapter9;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("strawberry");
        cake.setPrice(10);
        System.out.println("Cake flavor is " + cake.getFlavor() + ", and price is $" + String.format("%.2f", cake.getPrice()));

        BirthdayCake birthdayCake = new BirthdayCake("chocolate");
        birthdayCake.setPrice(20);
        birthdayCake.setCandles(21);
        System.out.println("Birthday cake flavor is " + birthdayCake.getFlavor() + ", and price is $" + String.format("%.2f", birthdayCake.getPrice()));
        System.out.println("Birthday cake has " + birthdayCake.getCandles() + " candles");

        WeddingCake weddingCake = new WeddingCake("vanilla");
        weddingCake.setPrice(100);
        weddingCake.setTiers(3);
        System.out.println("Wedding cake flavor is " + weddingCake.getFlavor() + ", and price is $" + String.format("%.2f", weddingCake.getPrice()));
        System.out.println("Wedding cake has " + weddingCake.getTiers() + " tiers");
    }
}