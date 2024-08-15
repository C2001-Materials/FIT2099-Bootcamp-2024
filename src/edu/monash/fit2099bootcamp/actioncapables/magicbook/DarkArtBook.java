package edu.monash.fit2099bootcamp.actioncapables.magicbook;

import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.Utility;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.BorrowAction;
import edu.monash.fit2099bootcamp.enums.Status;
import edu.monash.fit2099bootcamp.actioncapables.User;

import java.util.List;

/**
 * A class that represents a DarkArtBook, extending MagicBook and implementing Borrowable interface.
 */
public class DarkArtBook extends MagicBook implements Borrowable {
    private int darkMagicPoint;
    private Status status;

    /**
     * Constructor.
     *
     * @param title  the title of the DarkArtBook
     * @param author  the author of the DarkArtBook
     * @param darkMagicPoint  the dark magic point of the DarkArtBook
     */
    public DarkArtBook(String title, String author, int darkMagicPoint) {
        super(Utility.generateRandomInt(300, 400), title, author);
        this.darkMagicPoint = darkMagicPoint;
        this.status = Status.CURSED;
    }

    /**
     * Reads the DarkArtBook.
     * The user will gain dark magic points and CURSED status.
     *
     * @param user the User object
     */
    @Override
    public void read(User user) {
        user.addDarkMagicPoint(this.darkMagicPoint);
        user.addCapability(this.status);
    }

    /**
     * Borrows the DarkArtBook.
     * The user will gain dark magic points.
     *
     * @param user the User object
     */
    @Override
    public void borrow(User user) {
        user.addDarkMagicPoint(darkMagicPoint);
        System.out.println("User has borrowed " + getTitle() + " for several days, and have returned it back to Magic Library.");
    }

    /**
     * Returns a list of allowable actions for the DarkArtBook.
     * In this case, the allowable actions are ReadAction and BorrowAction.
     *
     * @return a list of allowable actions for the DarkArtBook
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new BorrowAction(this));
        return actions;
    }

    /**
     * Generates a pretty String representation of the DarkArtBook.
     *
     * @return a String representation of the DarkArtBook
     */
    @Override
    public String toString() {
        return super.toString() + "Dark Magic Point: " + darkMagicPoint;
    }
}