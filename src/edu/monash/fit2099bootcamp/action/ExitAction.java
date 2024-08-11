package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.User;

public class ExitAction implements Action {
    @Override
    public String execute(User user) {
        user.setComplete(true);
        System.out.println("Thank you for visiting Hogwarts Library of FIT2099!");
        System.exit(0);
        return null;
    }

    @Override
    public String menuDescription() {
        return "Exit from Hogwarts library";
    }
}