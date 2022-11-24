package hillel.suraieva.Running;


public class Cat implements Member {
    private String name;
    private int maxDistance = 2600;
    float maxHight = 2.5F;

    public Cat(String name) {
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public float getMaxHight() {
        return maxHight;
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
        String result = " перепрыгнул";
        return result;
    }

}



