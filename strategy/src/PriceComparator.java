import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.price < product2.price) return -1; 
        if (product1.price > product2.price) return 1; 
        else return 0; 
    }

}
