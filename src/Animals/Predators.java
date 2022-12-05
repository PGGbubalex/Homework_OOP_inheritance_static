package Animals;

import Transport.ValidateUtil;

public class Predators extends Mammals {

    private final String typeOfFood;

    public Predators(String name, int age, String livEnvironment, int moveSpeed, String typeOfFood) {

        super(name, age, livEnvironment, moveSpeed);

        this.typeOfFood = ValidateUtil.validateString(typeOfFood);
    }

    public void hunt() {

    }

    @Override
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

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return super.toString() + "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
