package Shows;

import Peoples.Actor;
import Peoples.AutorMusic;
import Peoples.Director;

import java.util.ArrayList;

public class MusicalShow extends Show{
    private final AutorMusic musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, Director director, int duration, /*ArrayList<Actor> listOfActors,*/ AutorMusic musicAuthor, String librettoText) {
        super(title, director, duration /*listOfActors*/);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public AutorMusic getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Текст либретто:\n" + librettoText);
    }
}
