package Animals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
