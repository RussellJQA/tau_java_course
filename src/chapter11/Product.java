package chapter11;

public interface Product {

    double getPrice();
    void setPrice(double price);

    double getName();
    void setName(double name);

    double getColor();
    void setColor(double color);

    default String getBarcode() {
        return "no barcode";
    }
}