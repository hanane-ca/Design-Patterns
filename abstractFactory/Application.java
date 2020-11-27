public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(Factory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
