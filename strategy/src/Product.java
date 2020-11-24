
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
    public String toString() {
        return this.name + ' ' + this.price + ' ' + this.year;
    }

    @Override
    public int compareTo(Product product) {
        return this.toString().compareTo(product.toString());
    }

}
