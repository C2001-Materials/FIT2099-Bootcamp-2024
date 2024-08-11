package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.magicbook.*;

import java.util.ArrayList;
import java.util.List;

public class MagicLibrary {
    private final List<MagicBook> magicBooks;

    public MagicLibrary() {
        this.magicBooks = new ArrayList<>();
    }

    public void createBooks() {
        // add the books to the ArrayList
        magicBooks.add(new SpellBook("S01", "Charms of Defence and Deterrence", "Catullus Spangle", 10));
        magicBooks.add(new SpellBook("S02", "Essential Defence Against the Dark Arts", "Arsenius Jigger", 10));
        magicBooks.add(new HerbAndPotionBook("H01", "Goshawk's Guide to Herbology", "Miranda Goshawk", 15));
        magicBooks.add(new HerbAndPotionBook("H02", "Magical Drafts and Potions", "Arsenius Jigger", 15));
        magicBooks.add(new DarkArtBook("D01", "Magick Moste Evile", "Godelot", 20));
        magicBooks.add(new DarkArtBook("D02", "Secrets of the Darkest Art", "Owle Bullock", 30));
        magicBooks.add(new AncientMagicBook("A01", "Hogwarts: A History", "Bathilda Bagshot", 5));
        magicBooks.add(new AncientMagicBook("A02", "Scars of Salem: Essays on the Witch Trials of 1692", "Carlos Eduardos", 5));
    }

    public void addActionsToMenu() {
        User user = new User(0, 0); // Assuming a user is created here
        while (!user.isComplete()) {
            List<Action> actions = new ArrayList<>();

            List<ActionCapable> actionCapables = new ArrayList<>();
            actionCapables.add(user); // edu.monash.fit2099bootcamp.action.ExitAction
            actionCapables.add(new StaticOneLibrarian());
            actionCapables.addAll(magicBooks); //edu.monash.fit2099bootcamp.action.ReadAction and edu.monash.fit2099bootcamp.action.BorrowAction
            for (ActionCapable actionCapable : actionCapables) {
                actions.addAll(actionCapable.allowableActions());
            }

            System.out.println("##################################");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(user));
        }
    }

    public void printStatus() {
        System.out.println("\nWelcome to Hogwarts Library of FIT2099");
        createBooks();
        addActionsToMenu();
        System.out.println("Thank you for visiting Hogwarts Library of FIT2099!");
    }
}