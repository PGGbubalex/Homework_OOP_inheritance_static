package Animals;

public class Flying extends Birds {

    private final String typeOfMovement;

    public Flying(String name, int age, String livEnvironment, String typeOfMovement) {

        super(name, age, livEnvironment);

        this.typeOfMovement = ValidationUtil.validateString(typeOfMovement);
    }

    public void fly() {
        System.out.println("летает в небе");
    }

    @Override
    public void eat() {
        System.out.println("ест мясо или рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("спит");
    }

    @Override
    public void move() {
        System.out.println("летает");
    }

    @Override
    public void hunt() {
        System.out.println("охотится");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public String toString() {
        return super.toString() + "Flying{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
