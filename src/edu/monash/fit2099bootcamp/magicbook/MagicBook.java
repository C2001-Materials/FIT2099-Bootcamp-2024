package edu.monash.fit2099bootcamp.magicbook;

import edu.monash.fit2099bootcamp.ActionCapable;
import edu.monash.fit2099bootcamp.Borrowable;
import edu.monash.fit2099bootcamp.User;
import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.BorrowAction;
import edu.monash.fit2099bootcamp.action.ReadAction;

import java.util.ArrayList;
import java.util.List;

public abstract class MagicBook implements ActionCapable {
    private String ID;
    private String title;
    private String author;

    public MagicBook(String ID, String title, String author) {
        this.ID = ID;
        this.title = title;
        this.author = author;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void read(User user);

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new ReadAction(this));
//        if (this instanceof Borrowable) {
//            actions.add(new BorrowAction((Borrowable) this));
//        }
        return actions;
    }

    @Override
    public String toString() {
        return "Name: " + title + " | " +
                "Author: " + author + " | " +
                "ID: " + ID + " | ";

    }
}
