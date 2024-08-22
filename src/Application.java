import edu.monash.fit2099bootcamp.MagicLibrary;

/**
 * A class that represents the Application.
 * Driver class to run the MagicLibrary.
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
        MagicLibrary magicLibrary = new MagicLibrary();
        magicLibrary.printStatus();
    }
}