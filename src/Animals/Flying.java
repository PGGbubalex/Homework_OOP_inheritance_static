package Animals;

public class Flying extends Birds {

    private final String typeOfMovement;

    public Flying(String name, int age, String livEnvironment, String typeOfMovement) {

        super(name, age, livEnvironment);

        this.typeOfMovement = ValidationUtil.validateString(typeOfMovement);
    }

    public void fly() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void hunt() {

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
