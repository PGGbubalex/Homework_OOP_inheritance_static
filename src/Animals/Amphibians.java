package Animals;

import Transport.ValidateUtil;

import java.util.Objects;

public class Amphibians extends Animals {

    private final String livEnvironment;

    public Amphibians(String name, int age, String livEnvironment) {
        super(name, age);

        this.livEnvironment = ValidateUtil.validateString(livEnvironment);
    }

    public String getLivEnvironment() {
        return livEnvironment;
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
    public String toString() {
        return super.toString() + "Amphibians{" +
                "livEnvironment='" + livEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livEnvironment, that.livEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livEnvironment);
    }
}
