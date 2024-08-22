package edu.monash.fit2099bootcamp.actioncapables.magicbook;

import edu.monash.fit2099bootcamp.enums.Status;
import edu.monash.fit2099bootcamp.actioncapables.User;
import edu.monash.fit2099bootcamp.Utility;

/**
 * A class that represents an AncientMagicBook, extending MagicBook class.
 *
 * @author Aaron Lam Kong Yew
 * @version 2.1.0
 */
public class AncientMagicBook extends MagicBook {
    private int magicPoint;
    private Status status;

    /**
     * Constructor.
     *
     * @param title the title of the book
     * @param author the author of the book
     * @param magicPoint the magic point of the book
     */
    public AncientMagicBook(String title, String author, int magicPoint) {
        super(Utility.generateRandomInt(1, 100), title, author);
        this.magicPoint = magicPoint;
        this.status = Status.ANCIENT_WISDOM;
    }

    /**
     * Reads the AncientMagicBook.
     * If the user is CURSED, the user will be cured and gain ANCIENT_WISDOM status.
     * Otherwise, the user will gain magic points as usual.
     *
     * @param user the User object
     */
    @Override
    public void read(User user) {
        if (user.hasCapability(Status.CURSED)) {
            user.removeCapability(Status.CURSED);
            user.addCapability(status);
            user.deductDarkMagicPoint(magicPoint);
            System.out.println("I am feeling much better!");
        } else {
            user.addMagicPoint(magicPoint);
        }
    }

    /**
     * Generates a pretty String representation of the AncientMagicBook.
     *
     * @return a String representation of the AncientMagicBook
     */
    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint + " | Book Type: " + status;
    }
}
