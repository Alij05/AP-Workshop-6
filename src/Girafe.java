public class Girafe extends Mammal implements Prey{
    private String property;

    public Girafe(String name, int age, int speed, String property) {
        super(name, age, speed);
        this.property = property;
    }


}
