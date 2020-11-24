class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(Product[] input) {
        strategy.sort(input);
    }
}
