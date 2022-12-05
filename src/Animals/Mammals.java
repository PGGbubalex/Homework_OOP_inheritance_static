package Animals;

import Transport.ValidateUtil;

import java.util.Objects;

public abstract class Mammals extends Animals {

    private final String livEnvironment;
    private final int moveSpeed;

    public Mammals(String name, int age, String livEnvironment, int moveSpeed) {
        super(name, age);

        this.livEnvironment = ValidateUtil.validateString(livEnvironment);
        this.moveSpeed = ValidateUtil.validateNum(moveSpeed);

    }

    public abstract void walk ();

    public String getLivEnvironment() {
        return livEnvironment;
    }


    public int getMoveSpeed() {
        return moveSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "Mammals{" +
                "livEnvironment='" + livEnvironment + '\'' +
                ", moveSpeed=" + moveSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return moveSpeed == mammals.moveSpeed && Objects.equals(livEnvironment, mammals.livEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livEnvironment, moveSpeed);
    }
}
