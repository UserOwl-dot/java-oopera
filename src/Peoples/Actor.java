package Peoples;

import java.util.Objects;

public class Actor extends Person {
    private final double height;
    public Actor(String name, String surname, double height, Genders gender) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor newActor = (Actor) obj;
        return Objects.equals(getName(), newActor.getName()) &&
                Objects.equals(getSurname(), newActor.getSurname()) &&
                (getHeight() == newActor.getHeight());
    }
}
