import java.util.Comparator;

public class YearComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.year < product2.year) return -1; 
        if (product1.year > product2.year) return 1; 
        else return 0; 
    }

}
