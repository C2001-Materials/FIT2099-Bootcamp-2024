package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.User;
import edu.monash.fit2099bootcamp.magicbook.MagicBook;

public class ReadAction implements Action {

    private MagicBook magicBook;

    public ReadAction(MagicBook magicBook) {
        this.magicBook = magicBook;
    }

    @Override
    public String execute(User user) {
        magicBook.read(user);

        int userNewMagicPoint = user.getMagicPoint();
        int userNewDarkMagicPoint = user.getDarkMagicPoint();

        return "edu.monash.fit2099bootcamp.User now has Magic power of " + userNewMagicPoint + " and Dark Art power of " + userNewDarkMagicPoint;
    }

    @Override
    public String menuDescription() {
        return "Read Book " + this.magicBook;
    }
}