public class User {
    private int magicPoint;
    private int darkMagicPoint;

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
}