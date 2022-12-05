package Animals;

import Transport.ValidateUtil;

public class Predators extends Mammals {

    private final String typeOfFood;

    public Predators(String name, int age, String livEnvironment, int moveSpeed, String typeOfFood) {

        super(name, age, livEnvironment, moveSpeed);

        this.typeOfFood = ValidateUtil.validateString(typeOfFood);
    }

    public void hunt() {
        System.out.println("охотится на животных");

    }

    @Override
    public void walk() {
        System.out.println("Бегает");
    }

    @Override
    public void eat() {
        System.out.println("ест мясо");
    }

    @Override
    public void sleep() {
        System.out.println("спит");
    }

    @Override
    public void move() {
        System.out.println("ходит по земле");
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
