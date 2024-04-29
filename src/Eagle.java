public class Eagle extends Bird implements Hunter{
    private String property;

    public Eagle(String name, int age, int height, String property) {
        super(name, age, height);
        this.property = property;
    }
    public void hunt(Prey prey){
        System.out.println(super.getName() + " hunt " + prey.getName());
    }
}
