package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.actioncapables.User;

/**
 * An interface that represents an Action.
 * WIll be implemented by concrete classes.
 *
 * @author Aaron Lam Kong Yew
 * @version 1.0.0
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