public class ReadAction extends Action {

    private MagicBook magicBook;

    public ReadAction(MagicBook magicBook)
    {
        this.magicBook = magicBook;
    }

    @Override
    public String execute(User user)
    {
        // trigger some kind of changes to the user’s magicPoint and darkMagicPoint
        //magicBook.read(user); // This method will be implemented in later bootcamp tasks

        int userNewMagicPoint = user.getMagicPoint();
        int userNewDarkMagicPoint = user.getDarkMagicPoint();

        return "User has read the book and now has " + userNewMagicPoint + " magic points and " + userNewDarkMagicPoint + " dark magic points.";
    }

    @Override
    public String menuDescription()
    {
        return "Read Book " + this.magicBook;
    }
}