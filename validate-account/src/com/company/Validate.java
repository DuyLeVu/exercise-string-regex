package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    static private Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public Validate(){
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
