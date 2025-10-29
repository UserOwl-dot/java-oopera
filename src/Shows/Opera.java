package Shows;

import Peoples.Actor;
import Peoples.AutorMusic;
import Peoples.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow{
    private final int choirSize;

    public Opera(String title, Director director, int duration, /*ArrayList<Actor> listOfActors,*/ AutorMusic musicAuthor, String librettoText, int choirSize) {
        super(title, director, duration, /*listOfActors,*/ musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
