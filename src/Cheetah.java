public class Cheetah extends Mammal implements Hunter{
    private String property;

    public Cheetah(String name, int age, int speed, String property) {
        super(name, age, speed);
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public void hunt(Prey prey){

    }

}
