package Animals;

import Transport.ValidateUtil;

public class Flightless extends Birds {

    private final String typeOfMovement;


    public Flightless(String name, int age, String livEnvironment, String typeOfMovement) {

        super(name, age, livEnvironment);

        this.typeOfMovement = ValidateUtil.validateString(typeOfMovement);
    }

    public void walk() {

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
        return super.toString() + "Flightless{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
