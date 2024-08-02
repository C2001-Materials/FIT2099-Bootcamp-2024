import java.util.ArrayList;
import java.util.List;

public abstract class MagicBook
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

    public abstract void read(User user);

    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new ReadAction(this));
        return actions;
    }

    @Override
    public String toString()
    {
        return  "Name: " + title + " | " +
                "Author: " + author + " | " +
                "ID: " + ID + " | ";

    }
}
