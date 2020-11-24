import java.util.Comparator;


public class NameComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.name.compareTo(product2.name);
    }
    
}
