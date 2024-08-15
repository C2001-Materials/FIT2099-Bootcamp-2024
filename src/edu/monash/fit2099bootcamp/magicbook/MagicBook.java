package edu.monash.fit2099bootcamp.magicbook;

import edu.monash.fit2099bootcamp.ActionCapable;
import edu.monash.fit2099bootcamp.User;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.ReadAction;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract class that represents a MagicBook, implementing ActionCapable interface.
 */
public abstract class MagicBook implements ActionCapable {
    private String ID;
    private String title;
    private String author;

    /**
     * Constructor.
     *
     * @param ID     the ID of the MagicBook
     * @param title  the title of the MagicBook
     * @param author the author of the MagicBook
     */
    public MagicBook(String ID, String title, String author) {
        this.ID = ID;
        this.title = title;
        this.author = author;
    }

    /**
     * Returns the title of the MagicBook.
     *
     * @return the title of the MagicBook as a String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the MagicBook.
     * An abstract method that will be implemented by four concrete classes.
     *
     * @return the author of the MagicBook as a String
     */
    public abstract void read(User user);

    /**
     * Returns a list of allowable actions for the MagicBook.
     * In this case, the only allowable action is ReadAction.
     *
     * @return a list of allowable actions for the MagicBook
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new ReadAction(this));
        return actions;
    }

    /**
     * Generates a pretty String representation of the MagicBook.
     *
     * @return a String representation of the MagicBook
     */
    @Override
    public String toString() {
        return "Name: " + title + " | " +
                "Author: " + author + " | " +
                "ID: " + ID + " | ";

    }
}
