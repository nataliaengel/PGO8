public class Main {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.addRule(form -> form.email().contains("@"));
        validator.addRule(form -> form.password().length() >= 8);
        validator.addRule(form -> form.age() >= 18);

        UserForm form = new UserForm("anna@example.com", "bezpieczne123", 20);
        System.out.println("Formularz Anny poprawny: " + validator.isValid(form));

        UserForm zly = new UserForm("bledny-email", "123", 16);
        System.out.println("Formularz zly poprawny: " + validator.isValid(zly));
    }
}
