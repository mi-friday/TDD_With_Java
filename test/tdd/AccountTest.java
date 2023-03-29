package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {


   @Test
   public void depositMoneyTest() {
       Account davidAccount = new Account();
       davidAccount.deposit(2_000);
       int balance = davidAccount.getBalance();
       assertEquals(2000, balance);

   }
    @Test
       public void depositTwiceTest(){
    Account davidAccount = new Account();
    davidAccount.deposit(2000);
    davidAccount.deposit(2000);
    assertEquals(4_000,davidAccount.getBalance());

   }
   @Test
    public void negativeValTest(){
       Account davidAccout = new Account();
       davidAccout.deposit(-2000);
       assertEquals(0,davidAccout.getBalance());
   }
   @Test
    public void depositThriceTest(){
       Account davidAccount = new Account();
       davidAccount.deposit(1);
       assertEquals(1,davidAccount.getBalance());
   }

   @Test
    public void withdrawCsahTest() {
       Account davidAccount = new Account();
       davidAccount.deposit(5000);
       davidAccount.withdraw(3000);
       assertEquals(2000, davidAccount.getBalance());
   }

   @Test
    public void withdrawCashTest2() {
      Account davidAccount = new Account();
      davidAccount.deposit(5000);
      davidAccount.withdraw(6000);
      assertEquals(5000, davidAccount.getBalance());


   }
}