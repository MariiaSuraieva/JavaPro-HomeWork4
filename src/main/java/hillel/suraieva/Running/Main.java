package hillel.suraieva.Running;

public class Main {
    public static void main(String[] args) {

        hillel.suraieva.Running.Member[] members = new hillel.suraieva.Running.Member[3];
        members[0] = new Cat("Ms.Kitty");
        members[1] = new Human("Kiril");
        members[2] = new Robot("Chappy");

        Barrier[] barriers = new Barrier[2];
        barriers[0] = new RaceTrack("беговая дорожка", 3000);
        barriers[1] = new Wall("стена", 1.5F);

        Competition competition = new Competition();

        for (int i = 0; i < members.length; i++) {
            competition.start(barriers[0], barriers[1], members[i]);
        }


    }
}
