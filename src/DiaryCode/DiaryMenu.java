package DiaryCode;

import java.util.Scanner;

public class DiaryMenu {

    private static Scanner collector = new Scanner(System.in);

    private static Diary tee = new Diary();
    public static void main(String[] args) {
        exploreMainMenu();
    }

    private static void exploreMainMenu() {

        String mainMenu = """
                =====================
                Welcome to Tee Diary
                1 -> Create Entry
                2 -> view Entry
                3 -> delete Entry
                4 -> count Entries
                5 -> Edit Entry
                6 -> change username/password
                7 -> Exit
                """;
        String userInput = typeIn(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> deleteEntry();
            case '4' -> countEntries();
            case '5' -> editEntry();
            case '6' -> changeYourPasswordOrUsername();
            case '7' -> exitApplication();
            default -> exploreMainMenu();
        }
    }

    private static void changeYourPasswordOrUsername() {
        int generateId = Integer.parseInt(typeIn("Kindly enter your Entry ID"));
        int id = generateId-1;
        String username = typeIn("Kindly fill in the username");
        String password = typeIn("Kindly fill in the password");
        tee.editLoginCredentials(id ,username, password);

        show("Login credentials successfully changed!!!");
        exploreMainMenu();
    }

    private static void createEntry(){
        String username = typeIn("kindly enter a username of your choice");
        String password = typeIn("set your password");
        String entryTitle = typeIn("This space is for you to type in your entry title");
        String entryBody = typeIn("Take your time to input what will be contained in your entry body"
        );

        tee.createAnEntryFor(username, password, entryTitle, entryBody);
        show("Entry created successfully!!!");
        show("here is your Entry ID as you proceed with using this app, keep it safe --> " +
                 tee.getNumberOfEntriesStored());
        exploreMainMenu();
    }


    private static void viewEntry() {
        int generateId = Integer.parseInt(typeIn("Kindly enter your Entry ID"));
        int id = generateId-1;
        String username = typeIn("Kindly fill in your username");
        String password = typeIn("Kindly fill in your password");
        tee.getMyDiary(id).verifyUsernameAndPassword(username, password);
        show(tee.getMyDiary(id).displayEntry());
        exploreMainMenu();
    }

    private static void deleteEntry(){
        int generateId = Integer.parseInt(typeIn("Kindly enter your Entry ID"));
        int id = generateId-1;
        String username = typeIn("Kindly fill in the username");
        String password = typeIn("Kindly fill in the password");

        tee.deleteEntry(id, username, password);
        show("Entry deleted successfully!!!");
        exploreMainMenu();
    }

    private static void countEntries() {

        show("Number of entries in the diary is/are ") ;
        show (String.valueOf(tee.getNumberOfEntriesStored()));

        exploreMainMenu();
    }

    private static void editEntry(){
        int generateId = Integer.parseInt(typeIn("Kindly enter your Entry ID"));
        int id = generateId-1;
        String username = typeIn("Kindly fill in the username");
        String password = typeIn("Kindly fill in the password");
        String titleOfEntry = typeIn("Type in your entry title");
        String entryBody = typeIn("Type in your entry body");
        tee.editEntry(id, username, password, titleOfEntry, entryBody);
        show("Entry edited successfully!!!");
        exploreMainMenu();


    }

    private static void exitApplication(){

        show("Thank you for using this app");
        System.exit(1);

    }


    private static String typeIn(String prompt) {
        // JOptionPane.showMessageDialog(null, prompt);
        show(prompt);
        return collector.nextLine();
    }

    private static void show(String message) {
        //JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }

}
