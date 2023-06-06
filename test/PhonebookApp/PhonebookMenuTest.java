package PhonebookApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookMenuTest {

    private PhonebookMenu myContacts;

    @BeforeEach

    public void constructorForContactsTest(){

        myContacts = new PhonebookMenu();

        myContacts.createContactFor("", "", "", "");
    }

    @Test

    public void testThatMultipleContactsCanBeCreated(){

        myContacts = new PhonebookMenu();

        myContacts.createContactFor("duhsj", "53627", "sj@gmail.com", "fsg");
        myContacts.createContactFor("gs", "gsah", "ghda", "gdhj");
        myContacts.createContactFor("hf", "dgh", "fgh", "dhg");

        assertEquals(3, myContacts.getNumberOfContactsInPhonebook());
    }

    @Test

    public void testThatContactsCanBeViewedWithTheCorrectCredential(){

        myContacts = new PhonebookMenu();

        myContacts.createContactFor("duhsj", "53627", "sj@gmail.com", "fsg");

        String expected = """
                ======================
                name: duhsj
                Phone number: 53627
                Email address: sj@gmail.com
                Residential address: fsg
                ======================
                """;

        assertEquals(expected, myContacts.getMyContact("sj@gmail.com").
                displayPhonebookDetails("duhsj"));
    }



    @Test

    public void testThatContactsCanBeDeletedUsingCorrectCredential(){

        myContacts = new PhonebookMenu();

        myContacts.createContactFor("duhsj", "53627", "sj@gmail.com", "fsg");

        myContacts.createContactFor("duhsj", "53627", "sj@gmail.com", "fsg");
        myContacts.createContactFor("gs", "gsah", "ghda", "gdhj");
        myContacts.createContactFor("hf", "dgh", "fgh", "dhg");

       myContacts.deleteContact("hf");

        assertThrows(NullPointerException.class, () -> myContacts.getMyContact("dgh")
                .displayPhonebookDetails("dgh"));
    }

}