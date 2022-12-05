package Animals;

import Transport.ValidateUtil;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
