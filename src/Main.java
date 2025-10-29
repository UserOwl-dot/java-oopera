import Peoples.Actor;
import Peoples.Genders;

public class Main {

    public static void main(String[] args) {

        Actor actor = new Actor("name", "sername", 190, Genders.MALE);
        System.out.println(actor.getGender());

    }
}
