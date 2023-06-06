package DiaryCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DairyEntry {


    private String entryTitle;

    private String entryBody;

    private LocalDateTime entryDate;

//    private final int entryIdentification;

    private String username;

    private String password;

    public DairyEntry(String username, String password, String titleOfEntry, String bodyOfTheEntry, int realId) {


        this.username = username;

        this.password = password;

        entryTitle = titleOfEntry;

        entryBody = bodyOfTheEntry;

//        entryIdentification = idOfTheEntry;
    }


    public void setEntryTitle(String inputFromUser) {

//        verifyUsernameAndPassword(username, password);
        entryTitle = inputFromUser;
    }

    public void setCredentials( String username, String password) {

        this.username = username;

        this.password = password;
    }

    public String getEntryTitle( String username, String password) {

       // confirmThatItIsYourEntryNotSomeoneElse(id);

        verifyUsernameAndPassword(username, password);

        return entryTitle;
    }

    public void setEntryBody(String dataFromUser) {
       // verifyUsernameAndPassword(username, password);
        entryBody = dataFromUser;
    }


    public String getEntryBody( String username, String password) {
       // confirmThatItIsYourEntryNotSomeoneElse(id);

        verifyUsernameAndPassword(username, password);
        return entryBody;
    }

    public void verifyUsernameAndPassword(String username, String password) {
        if (!username.equals(this.username)) {
            throw new IllegalArgumentException("Invalid username or password");
        }
        if (!password.equals(this.password)) {
            throw new IllegalArgumentException("Invalid username or password");
        }
    }

//    public void confirmThatItIsYourEntryNotSomeoneElse(int id) {
//        if (id != entryIdentification) throw new IllegalArgumentException("Incorrect user ID");
//
//
//    }

    public static String printDateAndTime() {
        DateTimeFormatter appear = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String dateAndTime = current.format(appear);
        return dateAndTime;
    }

    //@Override
    public String displayEntry() {
//        confirmThatItIsYourEntryNotSomeoneElse(id);
//verifyUsernameAndPassword(username, password);
               return String.format("""
                ======================
                Diary Title: %s
                Diary Body: %s
                Time: %s
                ======================
                """
                , entryTitle, entryBody, printDateAndTime());
    }

}
