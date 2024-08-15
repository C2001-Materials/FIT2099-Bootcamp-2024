package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.TalkAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibrarianTwo implements ActionCapable {
    private ArrayList<String> monologues = new ArrayList<>();

    public LibrarianTwo() {

        // refer to docs_design/FoundationModelsUsed.txt
        monologues.add("We are only as strong as we are united, as weak as we are divided.");
        monologues.add("It is our choices that show what we truly are, far more than our abilities.");
        monologues.add("Happiness can be found even in the darkest of times, if one only remembers to turn on the light.");
        monologues.add("The truth. It is a beautiful and terrible thing, and should therefore be treated with great caution.");
        monologues.add("It does not do to dwell on dreams and forget to live.");
        monologues.add("A common mistake students make is submitting their assignments as draft.");
        monologues.add("Are you SUREE that's not an abstract class?");
        monologues.add("Haiyaa, you should have used a for-each loop instead of a while loop.");
    }

    public void speak() {
        Random random = new Random();
        if (random.nextInt(100) < 25) {
            System.out.println("deadly silence");
        } else {
            int index = random.nextInt(monologues.size());
            System.out.println(monologues.get(index));
        }
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new TalkAction(this));
        return actions;
    }
}