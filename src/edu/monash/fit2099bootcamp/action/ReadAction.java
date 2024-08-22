package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.actioncapables.User;
import edu.monash.fit2099bootcamp.actioncapables.magicbook.MagicBook;

/**
 * A class that represents a ReadAction, implementing Action interface.
 *
 * @author Aaron Lam Kong Yew
 * @version 1.4.0
 */
public class ReadAction implements Action {
    private MagicBook magicBook;

    /**
     * Constructor.
     *
     * @param magicBook the MagicBook object
     */
    public ReadAction(MagicBook magicBook) {
        this.magicBook = magicBook;
    }

    /**
     * Executes the ReadAction.
     * In this case, increases the user's magic points and dark magic points.
     *
     * @param user the User object
     * @return a String representing the result of the action
     */
    @Override
    public String execute(User user) {
        // ANSI escape code blue text
        String ANSI_YELLOW = "\u001B[33m";
        // ANSI escape code default text
        String ANSI_RESET = "\u001B[0m";
        magicBook.read(user);

        int userNewMagicPoint = user.getMagicPoint();
        int userNewDarkMagicPoint = user.getDarkMagicPoint();

        return "User now has Magic points of " + ANSI_YELLOW+userNewMagicPoint +ANSI_RESET+ " and Dark Magic points of " +ANSI_YELLOW+ userNewDarkMagicPoint+ANSI_RESET +
                " after reading " + magicBook.getTitle();
    }

    /**
     * Returns a description of the action.
     *
     * @return a String representing the description of the action
     */
    @Override
    public String menuDescription() {
        return "Read Book " + this.magicBook;
    }
}