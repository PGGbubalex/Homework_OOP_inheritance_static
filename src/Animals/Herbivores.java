package Animals;

import Transport.ValidateUtil;

public class Herbivores extends Mammals{

    private final String typeOfFood;

    public Herbivores(String name, int age, String livEnvironment, int moveSpeed, String typeOfFood) {
        super(name, age, livEnvironment, moveSpeed);

        this.typeOfFood = ValidateUtil.validateString(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public final void graze() {

        System.out.println("Я пасусь");

    }

    @Override
    public final void walk() {
        System.out.println("Я бегаю");

    }

    @Override
    public final void eat() {
        System.out.println("Я ем траву");

    }

    @Override
    public final void sleep() {

        System.out.println("Я сплю");

    }

    @Override
    public final void move() {
        System.out.println("Я хожу");

    }

    @Override
    public String toString() {
        return super.toString() + "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
