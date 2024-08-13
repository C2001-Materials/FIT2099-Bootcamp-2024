package edu.monash.fit2099bootcamp.magicbook;

import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.BorrowAction;
import edu.monash.fit2099bootcamp.enums.Status;
import edu.monash.fit2099bootcamp.User;

import java.util.List;

public class DarkArtBook extends MagicBook implements Borrowable {
    private int darkMagicPoint;
    private Status status;

    public DarkArtBook(String ID, String title, String author, int darkMagicPoint) {
        super(ID, title, author);
        this.darkMagicPoint = darkMagicPoint;
        this.status = Status.CURSED;
    }

    @Override
    public void read(User user) {
        user.addDarkMagicPoint(this.darkMagicPoint);
        user.addCapability(this.status);
    }

    @Override
    public void borrow(User user) {
        user.addDarkMagicPoint(darkMagicPoint);
        System.out.println("User has borrowed " + getTitle() + " for several days, and have returned it back to Magic Library.");
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new BorrowAction(this));
        return actions;
    }

    @Override
    public String toString() {
        return super.toString() + "Dark Magic Point: " + darkMagicPoint;
    }
}