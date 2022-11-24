package hillel.suraieva.Running;

public interface Member {
    int maxDistance = 0;
    float maxHight = 0;

    default int getMaxDistance() {
        return maxDistance;
    }

    default float getMaxHight() {
        return maxHight;
    }

    String name = null;

    default String getName() {
        return name;
    }

    String run();

    String jump();
}
