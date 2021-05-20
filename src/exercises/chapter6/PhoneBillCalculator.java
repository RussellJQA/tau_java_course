package exercises.chapter6;

public class PhoneBillCalculator {

    public static void main(String[] args) {
        System.out.println("\n*** Using default constructor:\n");
        PhoneBill bill = new PhoneBill();
        bill.printItemizedBill();

        System.out.println("\n*** Using ID-only constructor:\n");
        PhoneBill bill2 = new PhoneBill("Billy");
        bill2.printItemizedBill();

        System.out.println("\n*** Using all fields constructor:\n");
        PhoneBill bill3 = new PhoneBill("William", 10, 100, 150);
        bill3.printItemizedBill();
    }
}