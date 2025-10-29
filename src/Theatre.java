import Peoples.*;
import Shows.Ballet;
import Shows.Opera;
import Shows.Show;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        /*ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Семён", "Писков", 165, Genders.MALE));
        actors.add(new Actor("Анджелина", "Джоли", 175, Genders.FEMALE));
        actors.add(new Actor("Кристиан", "Грей", 185, Genders.MALE))*/;

        Actor actor1 = new Actor("Семён", "Песков", 165, Genders.MALE);
        Actor actor2 = new Actor("Анджелина", "Джоли", 175, Genders.FEMALE);
        Actor actor3 = new Actor("Кристиан", "Грей", 185, Genders.MALE);

        Director director1 = new Director("Дмитрий", "Победоносец", Genders.MALE, 19);
        Director director2 = new Director("Криситна", "Победоносовна", Genders.FEMALE, 19);

        AutorMusic autorMusic = new AutorMusic("Алишер", "Моргенштерн", Genders.MALE);
        Choreographer choreographer = new Choreographer("Добрыня", "Усаков", Genders.MALE);

        Show showClassic = new Show("Классический спектакль", director1, 240);
        showClassic.addNewActor(actor1);
        showClassic.addNewActor(actor2);
        System.out.println("Список актёров классического спектакля:");
        showClassic.printListOfActors();
        System.out.println();

        Opera opera = new Opera("Снежная опера", director2, 180,
                autorMusic, "текст либретто опера",3);
        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        System.out.println("Список актёров оперы:");
        opera.printListOfActors();
        System.out.println();
        opera.printLibrettoText();
        System.out.println();


        Ballet ballet = new Ballet("Лебединое озеро", director1, 180,
                autorMusic, "текст либретто балет", choreographer);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor3);
        System.out.println("Список актёров балета:");
        ballet.printListOfActors();
        System.out.println();
        ballet.printLibrettoText();
        System.out.println();

        showClassic.replaceActor(actor3, "Песков");
        System.out.println("Список актёров классического спектакля после замены:");
        showClassic.printListOfActors();
        System.out.println();

        System.out.println("Список актёров балета после замены:");
        System.out.println();
        ballet.replaceActor(actor2, "Груздев");
        ballet.printListOfActors();
    }
}
