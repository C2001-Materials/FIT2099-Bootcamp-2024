package edu.monash.fit2099bootcamp;

/**
 * An interface that represents a Borrowable object.
 * Classes that implement this interface must provide a borrow method.
 */
public interface Borrowable {

    /**
     * Allows the User to borrow the Borrowable object.
     *
     * @param user the User object
     */
    void borrow(User user);
}
