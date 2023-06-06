package PhonebookApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Contacts {

    private  String name;

    private  String phoneNumber;

    private  String emailAddress;

    private  String residentialAddress;


//    public Contacts(String name, String phoneNumber, String emailAddress, String residentialAddress) {
//
//        this.name = name;
//
//        this.phoneNumber = phoneNumber;
//
//        this.emailAddress = emailAddress;
//
//        this.residentialAddress = residentialAddress;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public void verifyPhoneBookDetails(String details) {
       if (!details.equalsIgnoreCase(name) && !details.equals(phoneNumber)
               && !details.equalsIgnoreCase(emailAddress)
               && !details.equalsIgnoreCase(residentialAddress))
                          {
            throw new IllegalArgumentException("Details not found or does not exist, Kindly enter a valid contact detail");
        }
    }

//    public static String dateAndTimeDisplay() {
//        DateTimeFormatter appear = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime current = LocalDateTime.now();
//        String dateAndTime = current.format(appear);
//        return dateAndTime;
//    }

        public String displayPhonebookDetails (String userInput){
            verifyPhoneBookDetails(userInput);
            return String.format("""
                            ======================
                            name: %s
                            Phone number: %s
                            Email address: %s
                            Residential address: %s
                            ======================
                            """
                    , name, phoneNumber, emailAddress, residentialAddress);
        }

}
