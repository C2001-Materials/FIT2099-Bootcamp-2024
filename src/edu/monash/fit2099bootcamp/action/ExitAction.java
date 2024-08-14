package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.User;

public class ExitAction implements Action {
    @Override
    public String execute(User user) {
        String ANSI_YELLOW = "\u001B[33m";
        user.setComplete(true);
        System.out.println(ANSI_YELLOW+"Exiting from Hogwarts Library...");
        System.exit(0);
        return null;
    }

    @Override
    public String menuDescription() {
        return "Exit from Hogwarts library";
    }
}