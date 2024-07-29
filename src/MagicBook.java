public class MagicBook
{
    private String ID;
    private String title;
    private String author;

    public MagicBook(String ID, String title, String author)
    {
        this.ID = ID;
        this.title = title;
        this.author = author;
    }

    public String getID()
    {
        return ID;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public String toString()
    {
        return  "Title: " + title + " | " +
                "Author: " + author + " | " +
                "ID: " + ID + " | ";

    }
}
