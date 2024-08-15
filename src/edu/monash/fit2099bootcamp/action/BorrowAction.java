package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.actioncapables.User;

/**
 * A class that represents a BorrowAction, implementing Action interface.
 */
public class BorrowAction implements Action {
    private Borrowable magicBook;

    /**
     * Constructor.
     *
     * @param magicBook the Borrowable object
     */
    public BorrowAction(Borrowable magicBook) {
        this.magicBook = magicBook;
    }

    /**
     * Executes the BorrowAction.
     *
     * @param user the User object
     * @return a String representing the result of the action
     */
    @Override
    public String execute(User user) {
        magicBook.borrow(user);
        return "You have borrowed the book.";
    }

    /**
     * Returns a description of the action.
     *
     * @return a String representing the description of the action
     */
    @Override
    public String menuDescription() {
        return "Borrow " + magicBook.toString();
    }
}
