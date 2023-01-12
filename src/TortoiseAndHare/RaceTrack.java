package TortoiseAndHare;

import java.util.Arrays;

public class RaceTrack {

    private final String[][] lanes;


    public RaceTrack() {

        int numberOfLanes = 2;
        int numberOfSquaresPerLane = 70;
        this.lanes = new String[numberOfLanes][numberOfSquaresPerLane];
        for ( String[] lane : lanes )
        Arrays.fill(lanes,)
    }

    public String[][] getLane() {
        return lanes;
    }

}
