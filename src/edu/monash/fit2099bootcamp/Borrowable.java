package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.actioncapables.User;

/**
 * An interface that represents a Borrowable object.
 * Classes that implement this interface must provide a borrow method.
 *
 * @author Aaron Lam Kong Yew
 * @version 1.0.0
 */
public interface Borrowable {

    /**
     * Allows the User to borrow the Borrowable object.
     *
     * @param user the User object
     */
    void borrow(User user);
}
