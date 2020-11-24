import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String args[]) throws InterruptedException {

        // we can provide any strategy to do the sorting
        int[] array = { 1, 4, 3, 7, 5 };
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(array);

        System.out.println("");

        // we can change the strategy without changing Context class
        ctx = new Context(new QuickSort());
        ctx.arrange(array);

        // we can sort objects
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product("Watch", 49, 2015));
        list.add(new Product("Bike", 199, 2020));
        list.add(new Product("Ball", 15, 2018));
        list.add(new Product("Car", 1449, 1998));

        // choose comparator or default comparator integrated in Product class
        NameComparator nameComparator = new NameComparator();
        Collections.sort(list,nameComparator);

        System.out.println("\nProducts after sorting : ");
        for (Product produit : list) {
            System.out.println(produit.name + " " + produit.price + " " + produit.year);
        }

        // try it yourself then …
    }
}
