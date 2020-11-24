
public class Product implements Comparable<Product> {

    String name;
    int price;
    int year;

    public Product(String name, int price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    @Override
    public int compareTo(Product produit) {
        return this.price - produit.price;
    }

}
