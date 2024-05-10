package org.example.object;

// DTO 클래스
public class PersonClass {
    private final String name;
    private final int age;

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }

    @Override
    public int hashCode() {
        return age + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PersonClass target) {
            return age == target.age() && name.equals(target.name());
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
