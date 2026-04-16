package questao1;

public class PasswordAuth implements AuthStrategy {
    // In a real system these checks would query a user store.
    @Override
    public boolean authenticate(Credentials credentials) {
        if (credentials == null) return false;
        String user = credentials.getUsername();
        String pass = credentials.getPassword();
        if (user == null || pass == null) return false;
        // Simple hardcoded example
        return (user.equals("alice") && pass.equals("s3cr3t"))
            || (user.equals("bob") && pass.equals("password"));
    }
}
