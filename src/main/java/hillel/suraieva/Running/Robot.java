package hillel.suraieva.Running;

public class Robot implements Member {
    private String name;
    private int maxDistance = 25000;
    private float maxHight = 2.3F;

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public float getMaxHight() {
        return maxHight;
    }

    public Robot(String name) {
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
        String result = " перепрыгнул ";
        return result;
    }
}
