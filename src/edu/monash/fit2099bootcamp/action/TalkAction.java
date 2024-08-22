package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.actioncapables.librarian.Librarian;
import edu.monash.fit2099bootcamp.actioncapables.User;

/**
 * A class that represents a TalkAction, implementing Action interface.
 *
 * @author Aaron Lam Kong Yew
 * @version 5.0.0
 */
public class TalkAction implements Action {
    private final Librarian librarian;

    /**
     * Constructor.
     *
     * @param librarian the Librarian object
     */
    public TalkAction(Librarian librarian) {
        this.librarian = librarian;
    }

    /**
     * Executes the TalkAction.
     * In this case, invokes the speak() method of the Librarian object.
     *
     * @param user the User object
     * @return a String representing the result of the action
     */
    @Override
    public String execute(User user) {
        return librarian.speak();
    }

    /**
     * Returns a description of the action.
     *
     * @return a String representing the description of the action
     */
    @Override
    public String menuDescription() {
        return "Talk to  " + librarian.getName();
    }
}