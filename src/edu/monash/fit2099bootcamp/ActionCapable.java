package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;

import java.util.List;

public interface ActionCapable {
    List<Action> allowableActions();
}