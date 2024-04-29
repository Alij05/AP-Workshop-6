public class Parrot extends Bird implements Prey{
    private String property;

    public Parrot(String name, int age, int height, String property) {
        super(name, age, height);
        this.property = property;
    }
}
