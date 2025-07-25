package com.ericbouchut.datatype.primitive;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jack", '$', (short) 35, 1000D);

        System.out.println(account);

        System.out.println("Birthday!");
        account.birthday();
        System.out.println("age: " + account.getAge());


        System.out.println("Jackpot!");
        account.jackpot();
        System.out.println("account balance:" + account.getBalance());

        System.out.println(account);

        System.out.println("pinCode: " + account.getPinCode());
        System.out.println("Changing pinCode");
        account.setPinCode(new char[] {'A', 'B', 'C', 'D'});
        System.out.println("pinCode: " + account.getPinCode());
    }
}