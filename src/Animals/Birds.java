package Animals;

import Transport.ValidateUtil;

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
}
