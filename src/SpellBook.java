public class SpellBook extends MagicBook {
    private int magicPoint;

    public SpellBook(String ID, String title, String author, int magicPoint) {
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
