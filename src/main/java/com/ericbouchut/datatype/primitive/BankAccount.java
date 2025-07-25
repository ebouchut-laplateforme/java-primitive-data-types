package com.ericbouchut.datatype.primitive;

import lombok.Getter;
import lombok.ToString;

@ToString
public class BankAccount {
     protected String holderName;

     @Getter
     private char currency;

     @Getter
     private short age;

     @Getter
     private double balance;

     private char[] code = {'A', 'B', 'C', '4', '2', '1'};

     public BankAccount(String holderName, char curency, short age, double balance) {
          this.holderName = holderName;
          this.currency = currency;
          this.age = age;
          this.balance = balance;
     }

     /**
      * Make a deposit of the specified amount.
      * If the deposit failed the balance is unchanged.
      *
      * @param amount the amount to deposit to the account
      * @return false if the deposit failed
      */
     public boolean deposit(double amount) {
          balance += amount;

          return true;
     }

     /**
      * This one is the gold mine 🤩.
      */
     void jackpot() {
          balance *= 2;
     }

     void birthday() {
          age += 1;
     }

     protected void displayCode() {
          for(int index = 0;  index < code.length;  index++) {
               System.out.print( code[index]);
          }
          System.out.println();
     }
}
