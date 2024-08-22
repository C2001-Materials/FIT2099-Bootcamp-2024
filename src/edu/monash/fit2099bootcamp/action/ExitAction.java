package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.actioncapables.User;

/**
 * A class that represents an ExitAction, implementing Action interface.
 *
 * @author Aaron Lam Kong Yew
 * @version 2.4.0
 */
public class ExitAction implements Action {

    /**
     * Executes the ExitAction.
     *
     * @param user the User object
     * @return a String representing the result of the action
     */
    @Override
    public String execute(User user) {
        String ANSI_YELLOW = "\u001B[33m";
        user.setComplete(true);
        System.out.println(ANSI_YELLOW+"Exiting from Hogwarts Library...");
        System.exit(0);
        return null;
    }

    /**
     * Returns a description of the action.
     *
     * @return a String representing the description of the action
     */
    @Override
    public String menuDescription() {
        return "Exit from Hogwarts library";
    }
}