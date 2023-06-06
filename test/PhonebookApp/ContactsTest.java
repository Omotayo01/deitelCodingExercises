package PhonebookApp;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactsTest {

    private Contacts tecno;

    @BeforeEach

    public void thatAContactCanBeCreatedTest(){
        tecno = new Contacts();

    }

    @Test
    public  void testThatAContactCanBeFoundByTheCorrectCredentials(){

        tecno.setName("Tope-OGSA");
        tecno.setPhoneNumber("08106679395");
        tecno.setEmailAddress("omotobi@gmail.com");
        tecno.setResidentialAddress("No 4 kasamu street, Lagos");

        String expected = """
                ======================
                name: Tope-OGSA
                Phone number: 08106679395
                Email address: omotobi@gmail.com
                Residential address: No 4 kasamu street, Lagos
                ======================
                """;

        assertEquals(expected, tecno.displayPhonebookDetails("No 4 KASAMU street, Lagos"));
    }

    @Test
    public  void testThatAContactCannotBeFoundByTheWrongCredentials(){

        tecno.setName("Tope-OGSA");
        tecno.setPhoneNumber("08106679395");
        tecno.setEmailAddress("omotobi@gmail.com");
        tecno.setResidentialAddress("No 4 kasamu street, Lagos");


        assertThrows(IllegalArgumentException.class, () -> tecno.displayPhonebookDetails("Too"));
    }
}