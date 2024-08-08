public class AncientMagicBook extends MagicBook {
    private int magicPoint;
    private Status status;

    public AncientMagicBook(String ID, String title, String author, int magicPoint) {
        super(ID, title, author);
        this.magicPoint = magicPoint;
        this.status = Status.ANCIENT_WISDOM;
    }

    @Override
    public void read(User user) {
        if (user.hasCapability(Status.CURSED)) {
            user.removeCapability(Status.CURSED);
            user.addCapability(status);
            user.deductDarkMagicPoint(magicPoint);
            System.out.println("I am feeling much better!");
        } else {
            user.addMagicPoint(magicPoint);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint;
    }
}
