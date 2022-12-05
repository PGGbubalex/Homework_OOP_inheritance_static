package Animals;

import Transport.ValidateUtil;

import java.util.Objects;

public abstract class Birds extends Animals {

    private final String livEnvironment;

    public Birds(String name, int age, String livEnvironment) {
        super(name, age);

        this.livEnvironment = ValidateUtil.validateString(livEnvironment);
    }

    public String getLivEnvironment() {
        return livEnvironment;
    }

    public abstract void hunt();

    @Override
    public String toString() {
        return super.toString() + "Birds{" +
                "livEnvironment='" + livEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livEnvironment, birds.livEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livEnvironment);
    }
}
