package edu.monash.fit2099bootcamp.librarian;

import edu.monash.fit2099bootcamp.ActionCapable;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.TalkAction;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract class that represents a Librarian, implementing ActionCapable interface.
 */
public abstract class Librarian implements ActionCapable {

    /**
     * Returns the name of the Librarian.
     *
     * @return the name of the Librarian as a String
     */
    public abstract String getName();

    /**
     * Returns the speech of the Librarian,
     * taken from a list of possible speeches in the monologue.
     *
     * @return the speech of the Librarian as a String
     */
    public abstract String speak();

    /**
     * Returns a list of allowable actions for the Librarian.
     * In this case, the only allowable action is TalkAction.
     *
     * @return a list of allowable actions for the Librarian
     */
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new TalkAction(this));
        return actions;
    }
}
