public class DarkArtBook extends MagicBook implements Borrowable {
    private int darkMagicPoint;
    private Status status;

    public DarkArtBook(String ID, String title, String author, int darkMagicPoint) {
        super(ID, title, author);
        this.darkMagicPoint = darkMagicPoint;
        this.status = Status.CURSED;
    }

    @Override
    public void read(User user) {
        user.addDarkMagicPoint(this.darkMagicPoint);
        user.addCapability(this.status);
    }

    @Override
    public void borrow(User user) {
        user.borrowBook(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Dark Magic Point: " + darkMagicPoint;
    }
}