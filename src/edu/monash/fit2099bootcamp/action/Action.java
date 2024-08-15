package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.User;

/**
 * An interface that represents an Action.
 * WIll be implemented by concrete classes.
 */
public interface Action {

    /**
     * Executes an action.
     *
     * @param user the User object
     * @return a String representing the result of the action
     */
    public String execute(User user);

    /**
     * Returns a description of the action.
     *
     * @return a String representing the description of the action
     */
    public String menuDescription();
}