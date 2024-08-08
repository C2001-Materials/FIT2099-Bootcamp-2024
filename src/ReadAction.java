public class ReadAction implements Action {

    private MagicBook magicBook;

    public ReadAction(MagicBook magicBook) {
        this.magicBook = magicBook;
    }

    @Override
    public String execute(User user) {
        magicBook.read(user);

        int userNewMagicPoint = user.getMagicPoint();
        int userNewDarkMagicPoint = user.getDarkMagicPoint();

        return "User now has Magic power of " + userNewMagicPoint + " and Dark Art power of " + userNewDarkMagicPoint;
    }

    @Override
    public String menuDescription() {
        return "Read Book " + this.magicBook;
    }
}