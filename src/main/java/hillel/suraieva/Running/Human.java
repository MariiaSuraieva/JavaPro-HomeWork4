package hillel.suraieva.Running;

public class Human implements Member {
    private String name;
    private int maxDistance = 9500;
    private float maxHight = 1.2F;

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public float getMaxHight() {
        return maxHight;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String run() {
        String result = " пробежал ";
        return result;
    }

    @Override
    public String jump() {
        String result = "перепрыгнул";
        return result;
    }
}
