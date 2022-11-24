package hillel.suraieva.Running;

public class Competition {
    public Competition() {
    }

    public void start(Barrier raceTrack, Barrier wall, Member member) {

        for (int i = 0; i < 1; i++) {
            if (member.getMaxDistance() >= raceTrack.getDistance()) {
                System.out.println("Участник " + member.getName() + member.run() + raceTrack.overcome() + " на дистанции " + raceTrack.getDistance() + " м.");

            } else {
                System.out.println("Участник " + member.getName() + " не" + member.run() + "преграду " + raceTrack.getName() + " на дистанции " + raceTrack.getDistance() + " м. Пройдено " + member.getMaxDistance() + " м.");
                break;
            }
            if (member.getMaxHight() >= wall.getHight())
                System.out.println("Участник " + member.getName() + member.jump() + wall.overcome() + wall.getHight() + " м.");
            else
                System.out.println("Участник " + member.getName() + " не " + member.jump() + " преграду " + wall.getName() + " на высоте " + wall.getHight() + " м. Прыгнул " + member.getMaxHight() + " м.");

        }

    }
}
