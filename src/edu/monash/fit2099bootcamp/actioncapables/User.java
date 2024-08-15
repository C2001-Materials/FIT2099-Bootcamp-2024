package edu.monash.fit2099bootcamp.actioncapables;

import edu.monash.fit2099bootcamp.ActionCapable;
import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.ExitAction;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a User, implementing ActionCapable interface.
 * The user can perform actions and has magic points and dark magic points.
 * The user can also borrow books from the library, and has a set of capabilities.
 */
public class User implements ActionCapable {
    private int magicPoint;
    private int darkMagicPoint;
    private final Set<Enum<?>> capabilitySet = new HashSet<>();
    private boolean complete;
    private final List<Borrowable> borrowedBooks = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param magicPoint  the magic point of the User
     * @param darkMagicPoint  the dark magic point of the User
     */
    public User(int magicPoint, int darkMagicPoint) {
        this.magicPoint = magicPoint;
        this.darkMagicPoint = darkMagicPoint;
        this.complete = false;
    }

    /**
     * Returns the magic point of the User.
     *
     * @return the magic point of the User
     */
    public int getMagicPoint() {
        return magicPoint;
    }

    /**
     * Sets the magic point of the User.
     *
     * @param magicPoint  the magic point of the User
     */
    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    /**
     * Adds magic points to the User.
     *
     * @param points  the points to be added
     */
    public void addMagicPoint(int points) {
        this.magicPoint += points;
    }

    /**
     * Deducts magic points from the User.
     *
     * @param points  the points to be deducted
     */
    public void deductMagicPoint(int points) {
        this.magicPoint -= points;
    }

    /**
     * Resets the magic point of the User.
     */
    public void resetMagicPoint() {
        this.magicPoint = 0;
    }

    /**
     * Returns the dark magic point of the User.
     *
     * @return the dark magic point of the User
     */
    public int getDarkMagicPoint() {
        return darkMagicPoint;
    }

    /**
     * Sets the dark magic point of the User.
     *
     * @param darkMagicPoint  the dark magic point of the User
     */
    public void setDarkMagicPoint(int darkMagicPoint) {
        this.darkMagicPoint = darkMagicPoint;
    }

    /**
     * Adds dark magic points to the User.
     *
     * @param points  the points to be added
     */
    public void addDarkMagicPoint(int points) {
        this.darkMagicPoint += points;
    }

    /**
     * Deducts dark magic points from the User.
     *
     * @param points  the points to be deducted
     */
    public void deductDarkMagicPoint(int points) {
        this.darkMagicPoint -= points;
    }

    /**
     * Resets the dark magic point of the User.
     */
    public void resetDarkMagicPoint() {
        this.darkMagicPoint = 0;
    }

    /**
     * Checks if the User has the capability.
     *
     * @return True if the User has the ENUM capability, False otherwise
     */
    public boolean hasCapability(Enum<?> capability) {
        return capabilitySet.contains(capability);
    }

    /**
     * Adds the capability to the User.
     */
    public void addCapability(Enum<?> capability) {
        if (!hasCapability(capability)) {
            capabilitySet.add(capability);
        }
    }

    /**
     * Removes the capability from the User.
     */
    public void removeCapability(Enum<?> capability) {
        if (hasCapability(capability)) {
            capabilitySet.remove(capability);
        }
    }

    /**
     * Determines wether the User wants to leave the library.
     *
     * @return True if the User wants to leave the library, False otherwise
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Sets the User's completion status.
     * If the User wants to leave the library, the completion status is set to True.
     *
     * @param complete  the completion status of the User
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    /**
     * Adds all possible actions that can be performed by the User.
     * In this case, the only allowable action is ExitAction.
     *
     * @return a list of allowable actions for the User
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new ExitAction());
        return actions;
    }
}