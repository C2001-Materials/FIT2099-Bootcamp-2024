public class DarkArtBook extends MagicBook {
    private int darkMagicPoint;

    public DarkArtBook(String ID, String title, String author, int darkMagicPoint) {
        super(ID, title, author);
        this.darkMagicPoint = darkMagicPoint;
    }

    @Override
    public void read(User user) {
        user.addDarkMagicPoint(darkMagicPoint);
    }

    @Override
    public String toString() {
        return super.toString() + "Dark Magic Point: " + darkMagicPoint;
    }
}