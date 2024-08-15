import edu.monash.fit2099bootcamp.MagicLibrary;

/**
 * A class that represents the Application.
 * Driver class to run the MagicLibrary.
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