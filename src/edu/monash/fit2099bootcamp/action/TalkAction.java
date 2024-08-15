package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.Librarian;
import edu.monash.fit2099bootcamp.User;

public class TalkAction implements Action {
    private final Librarian librarian;

    public TalkAction(Librarian librarian) {
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