package TortoiseAndHare;

public class RaceCourse {

    private  final RaceTrack raceTrack;

    private static final Pail pail = new Pail();


    public RaceCourse(){
        this.raceTrack = new RaceTrack();
    }
    public RaceTrack getRaceTrack() {
        return raceTrack;
    }


    public Pail getPail(){
        return pail;
}

}
