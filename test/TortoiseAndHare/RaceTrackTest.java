//package TortoiseAndHare;
//
//import TortoiseAndHare.RaceTrack;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//class RaceTrackTest {
//
//    private RaceTrack raceTrack;
//
//    @BeforeEach
//
//    public void setUp() {
//        raceTrack = new RaceTrack();
//    }
//
//    @Test
//
//    public void testThatRaceTrackExists(){
//        assertNotNull(raceTrack);
//    }
//
//    @Test
//
//    public void testThatRaceTrackLaneHas_70_Squares(){
//       String[][]lanes = raceTrack.getLane();
//        String[] laneOne = lanes[0];
//        String[] laneTwo = lanes[1];
//       assertEquals(70, laneOne.length);
//       assertEquals(70, laneTwo.length);
//    }
//
//    @Test
//
//    public void testThatRaceTrackLaneSquareIsBlankByDefault(){
//        String[][]lanes = raceTrack.getLane();
//        for (String[] lane: lanes){
//            for(String square : lane)
//                assertEquals()
//        }
//    }
//}
