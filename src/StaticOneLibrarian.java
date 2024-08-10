import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaticOneLibrarian implements ActionCapable {
    private String name = "Mr Chew";
    private ArrayList<String> monologues = new ArrayList<>();

    public StaticOneLibrarian() {
        monologues.add("We are only as strong as we are united, as weak as we are divided.");
        monologues.add("It is our choices that show what we truly are, far more than our abilities.");
        monologues.add("Happiness can be found even in the darkest of times, if one only remembers to turn on the light.");
        monologues.add("The truth. It is a beautiful and terrible thing, and should therefore be treated with great caution.");
        monologues.add("It does not do to dwell on dreams and forget to live.");
    }

    public String getName() {
        return name;
    }

    public String speak() {
        Random random = new Random();
        int index = random.nextInt(monologues.size());
        return monologues.get(index);
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new TalkAction(this));
        return actions;
    }
}