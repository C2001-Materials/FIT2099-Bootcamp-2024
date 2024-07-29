public class DarkArtBook extends MagicBook
{
    private double darkMagicPoint;

    public DarkArtBook(String ID, String title, String author, double darkMagicPoint)
    {
        super(ID, title, author);
        this.darkMagicPoint = darkMagicPoint;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Dark Magic Point: " + darkMagicPoint;
    }
}