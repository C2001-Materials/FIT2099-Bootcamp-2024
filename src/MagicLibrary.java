public class MagicLibrary
{
    private final MagicBook[] magicBooks;

    public MagicLibrary()
    {
        this.magicBooks = new MagicBook[8];
    }

    public void createBooks()
    {

        // add the books to the array
        magicBooks[0] =  new SpellBook("S01", "Charms of Defence and Deterrence", "Catullus Spangle", 10);
        magicBooks[1] =  new SpellBook("S02", "Essential Defence Against the Dark Arts", "Arsenius Jigger", 10);
        magicBooks[2] =  new HerbAndPotionBook("H01", "Goshawk's Guide to Herbology", "Miranda Goshawk", 15);
        magicBooks[3] =  new HerbAndPotionBook("H02", "Magical Drafts and Potions", "Arsenius Jigger", 15);
        magicBooks[4] =  new DarkArtBook("D01", "Magick Moste Evile", "Godelot", 20);
        magicBooks[5] =  new DarkArtBook("D02", "Secrets of the Darkest Art", "Owle Bullock", 30);
        magicBooks[6] =  new AncientMagicBook("A01", "Hogwarts: A History", "Bathilda Bagshot", 5);
        magicBooks[7] =  new AncientMagicBook("A02", "Scars of Salem: Essays on the Witch Trials of 1692", "Carlos Eduardos", 5);
    }

    public void displayBooks()
    {
        for (int i = 0; i < magicBooks.length; i++)
        {
            System.out.println("Book (" + (i+1) +
                    ")\n" + magicBooks[i].toString() + "\n");
        }
    }


    public void printStatus()
    {
        System.out.println("Welcome to the Hogwarts Library of FIT2099\n");
        createBooks();
        displayBooks();
        System.out.println("Thank you for visiting Hogwarts Library of FIT2099!");
    }
}
