package Animals;

import Transport.ValidateUtil;

import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;

    public Animals(String name, int age) {

        this.name = ValidateUtil.validateString(name);
        this.age = ValidateUtil.validateNum(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidateUtil.validateString(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = ValidateUtil.validateNum(age);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
