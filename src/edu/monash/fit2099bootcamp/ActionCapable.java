package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;

import java.util.List;

/**
 * An interface that represents an ActionCapable object.
 * Classes that implement this interface must provide a list of allowable actions.
 */
public interface ActionCapable {

    /**
     * Returns a list of allowable actions,
     * such as those who extend from the Action class.
     *
     * @return a list of allowable actions for the ActionCapable object
     */
    List<Action> allowableActions();
}