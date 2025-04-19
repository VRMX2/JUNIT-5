package Tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(12345);
    }

    @Test
    public void testGetAccountNum() {
        assertEquals(12345, account.getAccountNum());
    }

    @Test
    public void testGetBalance() {
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDepositPositiveAmount() {
        assertTrue(account.deposit(100));
        assertEquals(100, account.getBalance());
        assertEquals(100, account.getLastTransaction());
    }

    @Test
    public void testDepositZeroAmount() {
        assertFalse(account.deposit(0));
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        assertFalse(account.deposit(-50));
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testWithdrawSufficientFunds() {
        account.deposit(200);
        assertTrue(account.withdraw(100));
        assertEquals(100, account.getBalance());
        assertEquals(-100, account.getLastTransaction());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        account.deposit(50);
        assertFalse(account.withdraw(100));
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testWithdrawZeroAmount() {
        account.deposit(100);
        assertFalse(account.withdraw(0));
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        account.deposit(100);
        assertFalse(account.withdraw(-50));
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testMultipleTransactions() {
        assertTrue(account.deposit(300));
        assertTrue(account.withdraw(100));
        assertTrue(account.deposit(50));
        assertTrue(account.withdraw(200));
        assertEquals(50, account.getBalance());
        assertEquals(-200, account.getLastTransaction());
    }

    @Test
    public void testToString() {
        account.deposit(150);
        assertEquals("Account 12345(balance $150)", account.toString());
    }
}