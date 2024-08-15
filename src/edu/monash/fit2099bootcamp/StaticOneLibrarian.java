package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.TalkAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaticOneLibrarian  extends Librarian{
    private ArrayList<String> monologues;
    private String name;

    public StaticOneLibrarian() {
        this.monologues = new ArrayList<>();
        this.name = "Mr Chew";

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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String speak() {
        Random random = new Random();
        int index = random.nextInt(monologues.size());
        return monologues.get(index);
    }

}