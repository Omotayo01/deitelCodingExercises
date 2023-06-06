//package DiaryCode;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DairyEntryTest {
//
//    private DairyEntry omotayoDiary;
//
//    @BeforeEach
//
//    public void createADiaryTest(){
//        omotayoDiary = new DairyEntry();
//
//    }
//
////    @Test
////
////    public void testThatEntryTitleIsNotEmptyWithTheRightCredentials(){
////
////        omotayoDiary.setCredentials("T-why01", "0230abcda");
////        omotayoDiary.setEntryTitle("Captain's Log");
////
////        assertEquals("Captain's Log", omotayoDiary.getEntryTitle(0, "T-why01"
////                            , "0230abcda"));
////    }
//
////    @Test
////
//////    public void testThatEntryBodyIsNotEmptyWithTheRightCredentials(){
//////        omotayoDiary.setCredentials( "T-why01", "0230abcda");
//////
//////        omotayoDiary.setEntryBody ("T-why01", "0230abcda"
//////                , "My experience at the amazement park");
//////
//////        assertEquals("My experience at the amazement park", omotayoDiary.getEntryBody(0
//////        , "T-why01", "0230abcda"));
//////    }
////    @Test
//
////    public void testThatEntryTitleIsNotEmptyWithTheWrongId(){
////
////        omotayoDiary.setCredentials( "T-why01", "0230abcda");
////
////        omotayoDiary.setEntryTitle("T-why01", "0230abcda", "captian's jack");
////
////        assertThrows(IllegalArgumentException.class, () -> omotayoDiary.getEntryTitle(0
////        , "ty", "abcda"));
////    }
//
////    @Test
////
////    public void testThatEntryBodyIsNotEmptyWithTheWrongId(){
////
////        omotayoDiary.setCredentials( "T-why01", "0230abcda");
////
////        omotayoDiary.setEntryBody("T-why01", "0230abcda", "amazement park");
////
////        assertThrows(IllegalArgumentException.class, () -> omotayoDiary.getEntryBody(0
////                , "Twhy02", "0230abcd"));
////    }
//
//}