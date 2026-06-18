public record UserForm(String email, String password, int age) {
    public UserForm {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email nie moze byc pusty");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Haslo nie moze byc puste");
        }
    }
}
