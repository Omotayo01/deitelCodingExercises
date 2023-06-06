package PhonebookApp;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

public class PhonebookMenu {

    ArrayList<Contacts> phoneContacts = new ArrayList<>();
    Contacts newContact = new Contacts();


    public void createContactFor(String name, String phoneNumber, String emailAddress, String residentialAddress) {

//        Contacts newContact = new Contacts(name, phoneNumber, emailAddress, residentialAddress);
        newContact.setName(name);
        newContact.setPhoneNumber(phoneNumber);
        newContact.setEmailAddress(emailAddress);
        newContact.setResidentialAddress(residentialAddress);

        phoneContacts.add(newContact);
    }

    public int getNumberOfContactsInPhonebook() {

        return phoneContacts.size();
    }

    public Contacts getMyContact(String userInput) {
        newContact.verifyPhoneBookDetails(userInput);

       // Contacts pickEachContact = null;

        for (Contacts pickUp : phoneContacts) {


            if (userInput.equalsIgnoreCase(pickUp.getName()) || userInput.equals(pickUp.getPhoneNumber())
                    || userInput.equalsIgnoreCase(pickUp.getEmailAddress()) ||
                    userInput.equalsIgnoreCase(pickUp.getResidentialAddress())) {

                newContact = pickUp;

            }


        }
        return newContact;

    }


    public void editThisContact(String userInput) {
// String nameToSet, String phoneNumberNew, String emailNew,
//                String addressNew
        newContact = getMyContact(userInput);

//        newContact.setName(nameToSet);
//        newContact.setPhoneNumber(phoneNumberNew);
//        newContact.setEmailAddress(emailNew);
//       newContact.setResidentialAddress(addressNew);
    }

    public void deleteContact(String enterCredential) {

        phoneContacts.remove(getMyContact(enterCredential));
    }

    public void validateMainMenuEntry(String input){
        if (input.equals(""))
            throw new IllegalArgumentException("Invalid input");
    }
}



