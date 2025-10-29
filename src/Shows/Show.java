package Shows;

import Peoples.Actor;
import Peoples.Director;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, Director director, int duration /*ArrayList<Actor> listOfActors*/) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return listOfActors;
    }

    public void printListOfActors() {
        int i = 0;
        for (Actor actor : listOfActors) {
            i++;
            System.out.println(i + ". Имя: " + actor.getName() +
                    ", Фамилия: " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Такой актёр уже есть в списке!");
                return;
            }
        }

        listOfActors.add(newActor);
    }

    private void removeActorBySurname(String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                listOfActors.remove(actor);
                return;
            }
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        if (surnamePresent(surname)) {
            for (Actor actor : listOfActors) {
                if (newActor.equals(actor)) {
                    System.out.println("Нельзя заменить тем, кто участвует!");
                    return;
                }
            }
        } else {
            System.out.println("Такого актёра нет в списке!");
            return;
        }
        listOfActors.add(newActor);
        removeActorBySurname(surname);
    }

    private boolean surnamePresent(String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)){
                return true;
            }
        }
        return false;
    }
}
