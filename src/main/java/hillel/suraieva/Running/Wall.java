package hillel.suraieva.Running;

public class Wall implements Barrier {
    private float hight;
    private String name;

    public Wall(String name, float hight) {
        this.name = name;
        this.hight = hight;
    }

    @Override
    public String getName() {
        return name;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    @Override
    public String overcome() {
        String result = " стену на высоте ";
        return result;
    }
}
