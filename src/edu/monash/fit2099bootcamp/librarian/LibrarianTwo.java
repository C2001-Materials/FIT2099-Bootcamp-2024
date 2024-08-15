package edu.monash.fit2099bootcamp.librarian;

import edu.monash.fit2099bootcamp.Utility;

import java.util.ArrayList;

/**
 * A class that represents a LibrarianTwo, extending from Librarian.
 */
public class LibrarianTwo extends Librarian {
    private ArrayList<String> monologues;
    private String name ;

    /**
     * Constructor.
     * Name defaults to "Ms Mogana".
     */
    public LibrarianTwo() {
        this.monologues = new ArrayList<>();
        this.name = "Ms Mogana";

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

    /**
     * Returns the name of the LibrarianTwo object.
     *
     * @return a String representing the name of the LibrarianTwo object
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Returns the speech of the LibrarianTwo,
     * taken from a list of possible speeches in the monologue.
     * There is a 25% chance that the LibrarianTwo will be silent.
     *
     * @return the speech of the LibrarianTwo as a String
     */
    @Override
    public String speak() {
        String random = Utility.generateRandomInt(0, 100);
        int randomInt = Integer.parseInt(random);

        if (randomInt <= 25) {
            return "\"deadly silence...\"";
        } else {
            int index = Integer.parseInt(Utility.generateRandomInt(0, monologues.size() - 1));
            return monologues.get(index);
        }
    }
}