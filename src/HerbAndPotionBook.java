public class HerbAndPotionBook extends MagicBook implements Borrowable {
    private int magicPoint;

    public HerbAndPotionBook(String ID, String title, String author, int magicPoint) {
        super(ID, title, author);
        this.magicPoint = magicPoint;
    }

    @Override
    public void read(User user) {
        if (user.hasCapability(Status.CURSED)) {
            System.out.println("You are cursed! You cannot read this book!");
        } else {
            user.addMagicPoint(magicPoint);
        }
    }
    @Override
    public void borrow(User user) {
        user.borrowBook(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Magic Point: " + magicPoint;
    }

}
