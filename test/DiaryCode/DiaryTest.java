package DiaryCode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    private Diary myDiary;

    @BeforeEach

    public void constructorTest(){

        myDiary = new Diary();

        myDiary.createAnEntryFor("", "", "", "");

    }

    @Test

    public void testThatMultiplyEntriesCanBeCreated(){

        myDiary = new Diary();

        myDiary.createAnEntryFor("Tee1", "k2#2", "Jesus is coming"
                , "read your bible");
        myDiary.createAnEntryFor("Tee", "k2#3", "Jesus is coming"
                , "read your bible");

        assertEquals(2, myDiary.getNumberOfEntriesStored());
    }

    @Test
    public void thatEntryCanBeViewedWithTheCorrectUserIdTest() {

        myDiary.createAnEntryFor("Tee", "k2#2", "Jesus is coming"
                , "read your bible");


        String expected = """
                ======================
                Diary ID: 1
                Diary Title: Jesus is coming
                Diary Body: read your bible
                ======================
                """;

        assertEquals(expected, myDiary.getMyDiary(1).displayEntry());
    }

//    @Test

//    public void thatEntryCanBeDeletedTest(){
//        myDiary.createAnEntryFor("Tee", "k2#2", "Jesus is coming"
//                , "read your bible");
//
//        myDiary.deleteEntry(1);
//
//        assertEquals(1, myDiary.getNumberOfEntriesStored());
//    }

    @Test

    public void thatEntryCanBeEditedWithTheRightCredentials(){

        myDiary.getMyDiary(0);
        myDiary.editLoginCredentials(0, "kgb", "cia");
        myDiary.editEntry(0,"kgb","cia", "Jesus is coming"
                , "read your bible"  );

        String expected = """
                ======================
                Diary ID: 0
                Diary Title: Jesus is coming
                Diary Body: read your bible
                ======================
                """;

        assertEquals(expected, myDiary.getMyDiary(0).displayEntry());
    }

    @Test

    public void thatEntryCannotBeEditedWithTheWrongCredentials(){

        myDiary.getMyDiary(0);


        assertThrows(IllegalArgumentException.class, () -> myDiary.editEntry(0,"kgb"
                ,"ci", "Jesus is coming", "read your bible"  ));
    }
}