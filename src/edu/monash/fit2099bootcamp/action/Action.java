package edu.monash.fit2099bootcamp.action;

import edu.monash.fit2099bootcamp.User;

public interface Action {
    public String execute(User user);

    public String menuDescription();

}