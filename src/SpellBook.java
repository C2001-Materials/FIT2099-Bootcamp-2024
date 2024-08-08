public class SpellBook extends MagicBook {
    private int magicPoint;

    public SpellBook(String ID, String title, String author, int magicPoint) {
        super(ID, title, author);
        this.magicPoint = magicPoint;
    }

    @Override
    public void read(User user) {
        if (user.hasCapability(Status.CURSED)) {
            System.out.println("You are cursed! You cannot read this book!");
        } else {
            if (user.hasCapability(Status.ANCIENT_WISDOM)) {
                user.addMagicPoint(magicPoint * 2);
                System.out.println("After reading the ancient magic books, I can now understand more!");
            } else {
                user.addMagicPoint(magicPoint);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint;
    }

}
