package edu.monash.fit2099bootcamp.actioncapables.magicbook;

import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.Utility;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.BorrowAction;
import edu.monash.fit2099bootcamp.enums.Status;
import edu.monash.fit2099bootcamp.actioncapables.User;

import java.util.List;

/**
 * A class that represents a SpellBook, extending MagicBook and implementing Borrowable interface.
 *
 @author Aaron Lam Kong Yew
  @version 2.1.0
 */
public class SpellBook extends MagicBook implements Borrowable {
    private int magicPoint;

    /**
     * Constructor.
     *
     * @param title  the title of the SpellBook
     * @param author  the author of the SpellBook
     * @param magicPoint  the magic point of the SpellBook
     */
    public SpellBook(String title, String author, int magicPoint) {
        super(Utility.generateRandomInt(200, 300), title, author);
        this.magicPoint = magicPoint;
    }

    /**
     * Reads the SpellBook.
     * If the user is CURSED, the user will not be able to read the book.
     * If the user has ANCIENT_WISDOM, the user will gain double magic points.
     * Otherwise, the user will gain magic points as usual.
     *
     * @param user the User object
     */
    @Override
    public void read(User user) {
        if (user.hasCapability(Status.CURSED)) {
            System.out.println("You are cursed! You cannot read this book!");
        } else {
            if (user.hasCapability(Status.ANCIENT_WISDOM)) {
                user.addMagicPoint(magicPoint * 2);
                System.out.println("After reading the ancient magic books, I can now understand more!");
            } else {
                user.addMagicPoint(magicPoint);
            }
        }
    }

    /**
     * Borrows the SpellBook.
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
     * Returns a list of allowable actions for the SpellBook.
     * In this case, the allowable actions are ReadAction and BorrowAction.
     *
     * @return a list of allowable actions for the SpellBook
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new BorrowAction(this));
        return actions;
    }

    /**
     * Generates a pretty String representation of the SpellBook.
     *
     * @return a String representation of the SpellBook
     */
    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint + " | Book Type: Spell";
    }
}
