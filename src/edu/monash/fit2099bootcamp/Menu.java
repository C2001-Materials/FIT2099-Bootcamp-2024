package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;

import java.util.*;

public class Menu {

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
