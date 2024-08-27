import edu.monash.fit2099bootcamp.MagicLibrary;
import edu.monash.fit2099bootcamp.actioncapables.User;
import edu.monash.fit2099bootcamp.actioncapables.librarian.GeminiLibrarian;
import edu.monash.fit2099bootcamp.actioncapables.librarian.Librarian;
import edu.monash.fit2099bootcamp.actioncapables.librarian.LibrarianTwo;
import edu.monash.fit2099bootcamp.actioncapables.librarian.StaticOneLibrarian;
import edu.monash.fit2099bootcamp.actioncapables.magicbook.MagicBook;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents the Application.
 * Driver class to run the MagicLibrary.
 * Injector Class.
 *
 * @author Aaron Lam Kong Yew
 * @version 1.0.0
 */
public class Application {

    /**
     * Main method to run the MagicLibrary.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        User user = new User(0, 0);
        List<MagicBook> magicBooks = new ArrayList<>();
        List<Librarian> librarians = new ArrayList<>();
        librarians.add(new StaticOneLibrarian());
        librarians.add(new LibrarianTwo());
        librarians.add(new GeminiLibrarian());

        MagicLibrary magicLibrary = new MagicLibrary(magicBooks, user, librarians);
        magicLibrary.printStatus();
    }
}