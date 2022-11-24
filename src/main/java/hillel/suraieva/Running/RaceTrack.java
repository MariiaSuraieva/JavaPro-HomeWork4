package hillel.suraieva.Running;

public class RaceTrack implements Barrier{
    private String name;
    private int distance;


    public RaceTrack(String name,int distance) {
        this.name = name;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String overcome() {
        String result = "беговую дорожку";
        return result;
    }


}
