public class AncientMagicBook extends MagicBook {
    private int magicPoint;

    public AncientMagicBook(String ID, String title, String author, int magicPoint) {
        super(ID, title, author);
        this.magicPoint = magicPoint;
    }

    @Override
    public void read(User user) {
        user.addMagicPoint(magicPoint);
    }

    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint;
    }
}
