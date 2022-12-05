package Animals;

import Transport.ValidateUtil;

public class Flightless extends Birds {

    private final String typeOfMovement;


    public Flightless(String name, int age, String livEnvironment, String typeOfMovement) {

        super(name, age, livEnvironment);

        this.typeOfMovement = ValidateUtil.validateString(typeOfMovement);
    }

    public void walk() {
        System.out.println("Ходит пешком");
    }

    @Override
    public void eat() {
        System.out.println("Ест насекомых");

    }

    @Override
    public void sleep() {
        System.out.println("Спит");
    }

    @Override
    public void move() {
        System.out.println("Перемещается по земле");
    }

    @Override
    public void hunt() {
        System.out.println("охотится на насекомых");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public String toString() {
        return super.toString() + "Flightless{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
