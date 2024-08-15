package edu.monash.fit2099bootcamp.magicbook;

import edu.monash.fit2099bootcamp.enums.Status;
import edu.monash.fit2099bootcamp.User;
import edu.monash.fit2099bootcamp.Utility;

public class AncientMagicBook extends MagicBook {
    private int magicPoint;
    private Status status;

    public AncientMagicBook(String title, String author, int magicPoint) {
        super(Utility.generateRandomInt(1, 100), title, author);
        this.magicPoint = magicPoint;
        this.status = Status.ANCIENT_WISDOM;
    }

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

    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint;
    }
}
