package edu.monash.fit2099bootcamp.actioncapables.magicbook;

import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.Utility;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.BorrowAction;
import edu.monash.fit2099bootcamp.enums.Status;
import edu.monash.fit2099bootcamp.actioncapables.User;

import java.util.List;

/**
 * A class that represents a HerbAndPotionBook, extending MagicBook and implementing Borrowable interface.
 */
public class HerbAndPotionBook extends MagicBook implements Borrowable {
    private int magicPoint;

    public HerbAndPotionBook( String title, String author, int magicPoint) {
        super(Utility.generateRandomInt(100, 200), title, author);
        this.magicPoint = magicPoint;
    }

    /**
     * Reads the HerbAndPotionBook.
     * If the user is CURSED, the user will not be able to read the book.
     * Otherwise, the user will gain magic points as usual.
     *
     * @param user the User object
     */
    @Override
    public void read(User user) {
        if (user.hasCapability(Status.CURSED)) {
            System.out.println("You are cursed! You cannot read this book!");
        } else {
            user.addMagicPoint(magicPoint);
        }
    }

    /**
     * Borrows the HerbAndPotionBook.
     * The user will gain magic points.
     *
     * @param user the User object
     */
    @Override
    public void borrow(User user) {
        user.addMagicPoint(magicPoint);
        System.out.println("User has borrowed " + getTitle() +
                " for several days, and have returned it back to Magic Library.");
    }

    /**
     * Returns a list of allowable actions for the HerbAndPotionBook.
     * In this case, the allowable actions are ReadAction and BorrowAction.
     *
     * @return a list of allowable actions for the HerbAndPotionBook
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new BorrowAction(this));
        return actions;
    }

    /**
     * Generates a pretty String representation of the HerbAndPotionBook.
     *
     * @return a String representation of the HerbAndPotionBook
     */
    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint;
    }
}
