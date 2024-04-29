public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("eagle",10,100,"strong hunter");
        Girafe girafe = new Girafe("girafe",30,100,"long neck");
        eagle.hunt(girafe);
    }
}

