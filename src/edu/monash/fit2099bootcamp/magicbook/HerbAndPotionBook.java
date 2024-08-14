package edu.monash.fit2099bootcamp.magicbook;

import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.BorrowAction;
import edu.monash.fit2099bootcamp.enums.Status;
import edu.monash.fit2099bootcamp.User;

import java.util.List;

public class HerbAndPotionBook extends MagicBook implements Borrowable {
    private int magicPoint;

    public HerbAndPotionBook(String ID, String title, String author, int magicPoint) {
        super(ID, title, author);
        this.magicPoint = magicPoint;
    }

    @Override
    public void read(User user) {
        if (user.hasCapability(Status.CURSED)) {
            System.out.println("You are cursed! You cannot read this book!");
        } else {
            user.addMagicPoint(magicPoint);
        }
    }

    @Override
    public void borrow(User user) {
        user.addMagicPoint(magicPoint);
        System.out.println("User has borrowed " + getTitle() +
                " for several days, and have returned it back to Magic Library.");
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = super.allowableActions();
        actions.add(new BorrowAction(this));
        return actions;
    }

    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint;
    }
}
