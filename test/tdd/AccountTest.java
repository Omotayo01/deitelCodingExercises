package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {
        //given there is an account

        Account deborahAccount = new Account();

        //when I deposit 3500
        deborahAccount.deposit(3500);

        //check that balance is 3500
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(3500, deborahAccountBalance);
    }

    @Test
    public void depositTwiceTest() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 3000
        deborahAccount.deposit(3000);
        //when I deposit 2000
        deborahAccount.deposit(2000);
        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(5000, deborahAccountBalance);
    }

    @Test
    public void depositNegativeAmountTest() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 3000
        deborahAccount.deposit(3000);
        //when I deposit -2000
        deborahAccount.deposit(-2000);
        //check that balance is 3000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(3000, deborahAccountBalance);

    }

    @Test
    public void withdrawalTest() {
        //given there is an account
        Account omotayoAccount = new Account();
        //given that initial balance is 7000
        omotayoAccount.deposit(7000);
        //when I withdraw 3000
        omotayoAccount.withdraw(3000);
        //check that balance is 4000
        int omotayoAccountBalance = omotayoAccount.getBalance();
        assertEquals(4000, omotayoAccountBalance);
    }

    @Test
    public void withdrawalScamTest(){
        //given there is an account
        Account omotayoAccount = new Account();
        //given that initial balance is 4500
        omotayoAccount.deposit(4500);
        //when I withdraw 8000
        omotayoAccount.withdraw(8000);
        //check that balance is 4500
        int omotayoAccountBalance = omotayoAccount.getBalance();
        assertEquals(4500, omotayoAccountBalance);
    }

    @Test
    public void withdrawalDrunkTest(){
        //given there is an account
        Account omotayoAccount = new Account();
        //given that initial balance is 4500
        omotayoAccount.deposit(4500);
        //when I withdraw -1000
        omotayoAccount.withdraw(-1000);
        //check that balance is 4500
        int omotayoAccountBalance = omotayoAccount.getBalance();
        assertEquals(4500, omotayoAccountBalance);
    }

    @Test
    public void minimumWithdrawalPossibleOnAccountTest(){
        //given there is an account
        Account omotayoAccount = new Account();
        //given that initial balance is 4500
        omotayoAccount.deposit(4500);
        //when I withdraw 4000
        omotayoAccount.withdraw(4000);
        //check that balance remains 4500
        assertEquals(4500, omotayoAccount.getBalance());
    }
}







