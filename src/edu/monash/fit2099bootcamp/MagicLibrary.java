package edu.monash.fit2099bootcamp;

import edu.monash.fit2099bootcamp.action.Action;
import edu.monash.fit2099bootcamp.actioncapables.User;
import edu.monash.fit2099bootcamp.actioncapables.librarian.GeminiLibrarian;
import edu.monash.fit2099bootcamp.actioncapables.librarian.Librarian;
import edu.monash.fit2099bootcamp.actioncapables.librarian.LibrarianTwo;
import edu.monash.fit2099bootcamp.actioncapables.librarian.StaticOneLibrarian;
import edu.monash.fit2099bootcamp.actioncapables.magicbook.*;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a MagicLibrary.
 * It contains a list of MagicBooks and a User object,
 * and allows the User to interact with the MagicLibrary
 * and its librarians.
 *
 * @author Aaron Lam Kong Yew
 * @version 7.4
 *
 */
public class MagicLibrary {
    private final List<MagicBook> magicBooks;
    private User user;
    private final List<Librarian> librarians;

    /**
     * Constructor.
     */
    public MagicLibrary() {
        this.magicBooks = new ArrayList<>();
        this.user = new User(0, 0);
        this.librarians = new ArrayList<>();
    }

    /**
     * Creates the books in the MagicLibrary.
     */
    public void createBooks() {

        // add the books to the ArrayList
        magicBooks.add(new SpellBook("Charms of Defence and Deterrence", "Catullus Spangle", 10));
        magicBooks.add(new SpellBook("Essential Defence Against the Dark Arts", "Arsenius Jigger", 10));
        magicBooks.add(new HerbAndPotionBook("Goshawk's Guide to Herbology", "Miranda Goshawk", 15));
        magicBooks.add(new HerbAndPotionBook("Magical Drafts and Potions", "Arsenius Jigger", 15));
        magicBooks.add(new AncientMagicBook("Hogwarts: A History", "Bathilda Bagshot", 5));
        magicBooks.add(new AncientMagicBook("Scars of Salem: Essays on the Witch Trials of 1692", "Carlos Eduardos", 5));
        magicBooks.add(new DarkArtBook("Magick Moste Evile", "Godelot", 20));
        magicBooks.add(new DarkArtBook("Secrets of the Darkest Art", "Owle Bullock", 30));
    }

    /**
     * Appends new Librarian classes to the MagicLibrary.
     */
    public void addLibrarians() {
        librarians.add(new StaticOneLibrarian());
        librarians.add(new LibrarianTwo());
        librarians.add(new GeminiLibrarian());
    }

    /**
     * Collects all possible actions that can be performed,
     * and displays them as a text based-menu.
     * The user will select one from the available options.
     */
    public void addActionsToMenu() {
        while (!user.isComplete()) {
            List<Action> actions = new ArrayList<>();

            List<ActionCapable> actionCapables = new ArrayList<>();
            actionCapables.add(user); // ExitAction
            actionCapables.addAll(magicBooks); // ReadAction and BorrowAction
            actionCapables.addAll(librarians); // TalkAction
            for (ActionCapable actionCapable : actionCapables) {
                actions.addAll(actionCapable.allowableActions());
            }

            System.out.println("\u001B[34m##################################\u001B[0m");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(user));
        }
    }

    /**
     * Prints the status of the MagicLibrary.
     * Initializes the books and adds actions to the menu.
     */
    public void printStatus() {
        System.out.println("\n" + "\u001B[33m" + "Welcome to Hogwarts Library of FIT2099" + "\u001B[0m"); // yellow
        createBooks();
        addLibrarians();
        addActionsToMenu();
    }
}