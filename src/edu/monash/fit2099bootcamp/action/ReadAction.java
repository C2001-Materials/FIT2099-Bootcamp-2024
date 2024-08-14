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
        // ANSI escape code blue text
        String ANSI_YELLOW = "\u001B[33m";
        // ANSI escape code default text
        String ANSI_RESET = "\u001B[0m";
        magicBook.read(user);

        int userNewMagicPoint = user.getMagicPoint();
        int userNewDarkMagicPoint = user.getDarkMagicPoint();

        return "User now has Magic points of " + ANSI_YELLOW+userNewMagicPoint +ANSI_RESET+ " and Dark Magic points of " +ANSI_YELLOW+ userNewDarkMagicPoint+ANSI_RESET;
    }

    @Override
    public String menuDescription() {
        return "Read Book " + this.magicBook;
    }
}