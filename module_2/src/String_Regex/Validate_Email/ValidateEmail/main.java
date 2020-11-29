package String_Regex.Validate_Email.ValidateEmail;

import String_Regex.Validate_Email.ValidateEmail.EmailExample;

public class main {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            System.out.println("Email is " + email +" is valid: "+ emailExample.validate(email));
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ emailExample.validate(email));

        }
    }
}
