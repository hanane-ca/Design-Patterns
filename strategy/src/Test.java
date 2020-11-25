
public class Test {

    public static void main(String args[]) throws InterruptedException {

        // we can provide any strategy to do the sorting
        // int[] array = { 1, 4, 3, 7, 5 };
        // Context ctx = new Context(new BubbleSort());
        // ctx.arrange(array);

        // System.out.println("");

        // we can change the strategy without changing Context class
        // ctx = new Context(new QuickSort());
        // ctx.arrange(array);

        // we can sort objects
        Product[] list = { 
            new Product("Watch", 49, 2015),
            new Product("Bike", 199, 2020),
            new Product("Ball", 15, 2018),
            new Product("Car", 1449, 1998),
        };

        Context ctx = new Context(new QuickSort());
        ctx.arrange(list);

        // we can change the strategy without changing Context class
        ctx = new Context(new BubbleSort());
        ctx.arrange(list);

        // try it yourself then …
    }
}
