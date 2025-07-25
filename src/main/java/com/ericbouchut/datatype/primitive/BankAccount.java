package com.ericbouchut.datatype.primitive;

import lombok.Getter;
import lombok.ToString;

@ToString
public class BankAccount {
     /**
      * The default pin code when non has been set.
      */
     private static char[] DEFAULT_PIN_CODE = {'0', '1', '2', '3'};

     /**
      * The required size of a pin code (number of characters)
      */
     @ToString.Exclude
     private int PIN_CODE_SIZE = 4;

     /**
      * The account holder name.
      */
     protected String holderName;

     @Getter
     private char currency;

     @Getter
     private short age;

     @Getter
     private double balance;

     private char[] pinCode = new char[PIN_CODE_SIZE];


     public BankAccount(String holderName, char currency, short age, double balance) {
          this.holderName = holderName;
          this.currency = currency;
          this.age = age;
          this.balance = balance;
          setPinCode(DEFAULT_PIN_CODE);
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

     /**
      * This method should be called on birthday to increment the age
      */
     void birthday() {
          age += 1;
     }

     /**
      * Set a new pin code
      *
      * @param newPinCode an array of characters
      * @return false if newPinCode has not the required size. In this case the pinCode stays unchanged.
      */
     protected boolean setPinCode(char[] newPinCode) {
          // Ensure the pin code has the required size
          if(newPinCode.length != PIN_CODE_SIZE) {
               return false;
          }

          pinCode = java.util.Arrays.copyOf(newPinCode, newPinCode.length);
          return true;
     }
     /**
      * @return the default pin code as a String
      */
     String getPinCode() {
          // This is a convoluted example
          // whose goal is to practice how to handle a char array
          StringBuilder pinCodeBuilder = new StringBuilder();

          for(int index = 0;  index < pinCode.length;  index++) {
               pinCodeBuilder.append(pinCode[index]);
          }
          return pinCodeBuilder.toString();
     }
}
