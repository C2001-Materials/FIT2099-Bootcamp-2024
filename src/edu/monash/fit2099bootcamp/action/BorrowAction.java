package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.User;

public class BorrowAction implements Action {

    private Borrowable magicBook;

    public BorrowAction(Borrowable magicBook) {
        this.magicBook = magicBook;
    }

    @Override
    public String execute(User user) {
        magicBook.borrow(user);
        return "You have borrowed the book.";
    }

    @Override
    public String menuDescription() {
        return "Borrow " + magicBook.toString();
    }
}
