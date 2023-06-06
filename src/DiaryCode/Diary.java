package DiaryCode;


import PhonebookApp.Contacts;

import java.util.ArrayList;


public class Diary {

   ArrayList <DairyEntry> myDiary = new ArrayList<>();

  // DairyEntry omotayoDiary = new DairyEntry();



    public void createAnEntryFor( String username, String password, String titleOfEntry, String bodyOfTheEntry ) {
      int  realId = myDiary.size();


        DairyEntry omotayoDiary = new DairyEntry(username, password, titleOfEntry, bodyOfTheEntry, realId);
//       omotayoDiary.setCredentials(username, password);
//       omotayoDiary.setEntryTitle(titleOfEntry);
//       omotayoDiary.setEntryBody(bodyOfTheEntry);
//       omotayoDiary.
        myDiary.add(omotayoDiary);
    }

    public int getNumberOfEntriesStored() {

        return myDiary.size();
    }

    public DairyEntry getMyDiary(int id) {

//        for (DairyEntry pickup : myDiary) {


//            omotayoDiary = myDiary.get(id);
       //verifyUsernameAndPassword(username, password);
            return myDiary.get(id);
        }
//        return omotayoDiary;
//    }
    public void deleteEntry(int id, String username, String password){
        DairyEntry omotayoDiary = getMyDiary(id );
        omotayoDiary.verifyUsernameAndPassword(username, password);
        myDiary.remove(getMyDiary(id));

    }

    public void editLoginCredentials(int id,String username, String password){
       DairyEntry omotayoDiary = getMyDiary( id);
        omotayoDiary.verifyUsernameAndPassword(username, password);
        omotayoDiary.setCredentials(username, password);

    }

    public void editEntry(int id, String username, String password, String inputFromUserForTitle
            , String inputFromUserForBody ){

        DairyEntry omotayoDiary = getMyDiary( id);
        omotayoDiary.verifyUsernameAndPassword(username, password);
        omotayoDiary.setEntryTitle(inputFromUserForTitle);
        omotayoDiary.setEntryBody(inputFromUserForBody);

    }

//    public String showEntryContent(int id, String username, String password){
//        getMyDiary( id, username, password);
////        public String displayEntry() {
//////        confirmThatItIsYourEntryNotSomeoneElse(id);
//            return String.format("""
//                ======================
//                Diary Title: %s
//                Diary Body: %s
//                Time: %s
//                ======================
//                """
//                    ,omotayoDiary.getEntryTitle(username, password), omotayoDiary.getEntryBody(username, password)
//                    , omotayoDiary.printDateAndTime());
//        }


}
