package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;

import java.util.*;

/**
 * A class that represents a Menu op options,
 * allowing the User to select an Action from a list of Actions.
 */
public class Menu {

    /**
     * Displays a menu of options to the User,
     * applying a key to each Action in the list of Actions.
     * The User can then select an Action by entering the corresponding key.
     *
     * @param actions a list of Actions
     * @return the Action selected by the User
     */
    public static Action showMenu(List<Action> actions) {
        Scanner scanner = new Scanner(System.in);
        List<Character> freeChars = new ArrayList<>();
        Map<Character, Action> keyToActionMap = new HashMap<>();

        for (char j = 'a'; j <= 'z'; j++) {
            freeChars.add(j);
        }

        for (Action action : actions) {
            char c = freeChars.get(0);
            freeChars.remove(Character.valueOf(c));
            keyToActionMap.put(c, action);
            System.out.println(c + ": " + action.menuDescription());
        }

        char key;
        do {
            key = scanner.next().charAt(0);
        } while (!keyToActionMap.containsKey(key));

        return keyToActionMap.get(key);
    }
}
