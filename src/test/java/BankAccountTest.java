import org.junit.jupiter.api.Test;
import org.nathan.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    // Init BankAccount with balance equals to 0
    BankAccount bankAccount = new BankAccount();

    @Test
    void creditTest() {
        var newBalance = bankAccount.creditBalance(100);
        assertEquals(100, newBalance);
        var veryNewBalance = bankAccount.creditBalance(100);
        assertEquals(200, veryNewBalance);
    }

    @Test
    void debitTest() {
        bankAccount.creditBalance(100);

        var newBalance = bankAccount.debitBalance(25);
        assertEquals(75, newBalance);
    }

}
