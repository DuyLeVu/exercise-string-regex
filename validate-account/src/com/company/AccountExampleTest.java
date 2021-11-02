package com.company;

public class AccountExampleTest {
    public static final String[] validAccount = {"123abc_", "_abc123", "______", "123456", "abcdefg"};
    public static final String[] invalidAccount = {".@", "12345", "1234_", "abcde"};
    private  static Validate validate;
    public static void main(String[] args) {
        validate = new Validate();
        for (String account : validAccount){
            boolean isvalid = validate.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount){
            boolean isvalid = validate.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
