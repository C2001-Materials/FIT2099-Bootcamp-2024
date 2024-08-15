package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.action.TalkAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Librarian implements ActionCapable {

    public abstract String getName();

    public abstract String speak();

    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new TalkAction(this));
        return actions;
    }
}
