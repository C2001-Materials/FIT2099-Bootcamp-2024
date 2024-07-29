public class HerbAndPotionBook extends MagicBook
{
    private double magicPoint;

    public HerbAndPotionBook(String ID, String title, String author, double magicPoint)
    {
        super(ID, title, author);
        this.magicPoint = magicPoint;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Magic Point: " + magicPoint;
    }

}
