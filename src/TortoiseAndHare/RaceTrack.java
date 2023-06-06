package TortoiseAndHare;

public class RaceTrack {

    private final String[][] lanes;


    public RaceTrack() {

        int numberOfLanes = 2;
        int numberOfSquaresPerLane = 70;
        this.lanes = new String[numberOfLanes][numberOfSquaresPerLane];
    }

    public String[][] getLane() {
        return lanes;
    }

}
