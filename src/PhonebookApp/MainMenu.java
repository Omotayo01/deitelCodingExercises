package PhonebookApp;



import javax.swing.*;
import java.util.Scanner;

public class MainMenu {

    private static Scanner collector = new Scanner(System.in);


    private static  PhonebookMenu tee = new PhonebookMenu();

    public static void main(String[] args) {
        exploreMainMenu();
    }

    private static void exploreMainMenu() {

        String mainMenu = """
                =====================
                Welcome to Tee PhoneBook
                1 -> Create Contact
                2 -> view Contact
                3 -> delete Contact
                4 -> count Contacts
                5 -> Edit Contact
                6 -> Exit
                """;
        String userInput = typeIn(mainMenu);
            try { tee.validateMainMenuEntry(userInput);
        switch (userInput.charAt(0)) {
            case '1' -> createContact();
            case '2' -> viewContact();
            case '3' -> deleteContact();
            case '4' -> countContacts();
            case '5' -> editContact();
            case '6' -> exitApplication();
            default -> exploreMainMenu();
        }} catch (IllegalArgumentException error){
                show(error.getMessage());
                exploreMainMenu();
            }
    }

    private static void createContact() {

        String contactName = typeIn("Enter the contact name");
        String phoneNumber = typeIn("Enter the phone Number");
        String email = typeIn("Enter the email address of the contact");
        String residentialAddress = typeIn("Enter the residential address of the contact");

        tee.createContactFor(contactName, phoneNumber, email, residentialAddress);
        show("Contact created successfully!!!!");

        exploreMainMenu();
    }

    private static void viewContact() {
        String userInput = typeIn("Kindly enter name, phone number or email address of the contact you want to view");
       // PhonebookMenu toGenerateContact = new PhonebookMenu();
        try {
            show(tee.getMyContact(userInput).displayPhonebookDetails(userInput));
        } catch (IllegalArgumentException error){
            show(error.getMessage());
            viewContact();
        }
        exploreMainMenu();
    }
    private static void deleteContact(){
        String userInput = typeIn("Enter name, phone number or email address of the contact you want to delete");
        try {
            tee.deleteContact(userInput);
            show("Contact safely deleted");
        } catch (IllegalArgumentException error){
           show(error.getMessage());
            deleteContact();
        }
        exploreMainMenu();
    }


    private static void countContacts() {
        show(String.valueOf(tee.getNumberOfContactsInPhonebook()));
        exploreMainMenu();
    }

    private static void editContact() {
        String userInput = typeIn("Enter name, phone number or email address of the contact you want to edit");
        try {
            tee.editThisContact(userInput);
            String contactName = typeIn("Enter the contact name");
            String phoneNumber = typeIn("Enter the phone Number");
            String email = typeIn("Enter the email address of the contact");
            String residentialAddress = typeIn("Enter the residential address of the contact");
            tee.newContact.setName(contactName);
            tee.newContact.setPhoneNumber(phoneNumber);
            tee.newContact.setEmailAddress(email);
            tee.newContact.setResidentialAddress(residentialAddress);
            show("Contact successfully edited");
        }catch (IllegalArgumentException error){
            show(error.getMessage());
            editContact();
        }
        exploreMainMenu();
    }

    private static void exitApplication() {
        show("Thank you for using this app");
        System.exit(1);
    }

    private static String typeIn(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
//        show(prompt);
        //return collector.next();
    }
    private static void show (String message) {
        JOptionPane.showMessageDialog(null, message);
        //System.out.println(message);
    }

}
