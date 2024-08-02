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

    public void displayBooks() {
        for (int i = 0; i < magicBooks.size(); i++) {
            System.out.println("Book (" + (i + 1) + ")\n" + magicBooks.get(i).toString() + "\n");
        }
    }

    public void printStatus() {
        System.out.println("Welcome to the Hogwarts Library of FIT2099\n");
        createBooks();
        displayBooks();
        System.out.println("Thank you for visiting Hogwarts Library of FIT2099!");
    }
}