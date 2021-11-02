public class EmailExampleTest {
    private static Validate emailValidate;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailValidate = new Validate();
        for (String email : validEmail){
            boolean isvalid = emailValidate.validate(email);
            System.out.println("Email is "+ email + " is valid: "+ isvalid);
        }
        for (String email : invalidEmail){
            boolean isvalid = emailValidate.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
