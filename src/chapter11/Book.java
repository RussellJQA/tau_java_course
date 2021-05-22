package chapter11;

public class Book implements Product {

    private double price;
    private String name;
    private String color;

    private String author;
    private int pages;
    private String isbn;

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public double getName() {
        return 0;
    }

    @Override
    public void setName(double name) {

    }

    @Override
    public double getColor() {
        return 0;
    }

    @Override
    public void setColor(double color) {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}