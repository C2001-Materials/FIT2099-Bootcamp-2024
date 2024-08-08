import java.util.HashSet;
import java.util.Set;

public class User {
    private int magicPoint;
    private int darkMagicPoint;
    private final Set<Enum<?>> capabilitySet = new HashSet<>();


    public User(int magicPoint, int darkMagicPoint) {
        this.magicPoint = magicPoint;
        this.darkMagicPoint = darkMagicPoint;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public void addMagicPoint(int points) {
        this.magicPoint += points;
    }

    public void deductMagicPoint(int points) {
        this.magicPoint -= points;
    }

    public void resetMagicPoint() {
        this.magicPoint = 0;
    }

    public int getDarkMagicPoint() {
        return darkMagicPoint;
    }

    public void setDarkMagicPoint(int darkMagicPoint) {
        this.darkMagicPoint = darkMagicPoint;
    }

    public void addDarkMagicPoint(int points) {
        this.darkMagicPoint += points;
    }

    public void deductDarkMagicPoint(int points) {
        this.darkMagicPoint -= points;
    }

    public void resetDarkMagicPoint() {
        this.darkMagicPoint = 0;
    }

    public boolean hasCapability(Enum<?> capability) {
        return capabilitySet.contains(capability);
    }

    public void addCapability(Enum<?> capability) {
        if (!hasCapability(capability)) {
            capabilitySet.add(capability);
        }
    }

    public void removeCapability(Enum<?> capability) {
        if (hasCapability(capability)) {
            capabilitySet.remove(capability);
        }
    }

}