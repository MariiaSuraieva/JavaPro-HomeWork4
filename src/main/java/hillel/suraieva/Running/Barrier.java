package hillel.suraieva.Running;

public interface Barrier {
    int distance = 0;
    float hight = 0;
    String name = null;

    default float getHight() {
        return hight;
    }

    default String getName() {
        return name;
    }

    default int getDistance() {
        return distance;
    }

    String overcome();
}
