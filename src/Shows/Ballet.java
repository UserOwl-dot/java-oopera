package Shows;

import Peoples.Actor;
import Peoples.AutorMusic;
import Peoples.Choreographer;
import Peoples.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private final Choreographer choreographer;

    public Ballet(String title, Director director, int duration, /*ArrayList<Actor> listOfActors,*/
                  AutorMusic musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, director, duration, /*listOfActors,*/ musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }
}
