package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.StaticOneLibrarian;
import edu.monash.fit2099bootcamp.User;

public class TalkAction implements Action {
    private final StaticOneLibrarian librarian;

    public TalkAction(StaticOneLibrarian librarian) {
        this.librarian = librarian;
    }

    @Override
    public String execute(User user) {
        return librarian.speak();
    }

    @Override
    public String menuDescription() {
        return "Talk to  " + librarian.getName();
    }
}