package questao1;

public class TokenAuth implements AuthStrategy {
    @Override
    public boolean authenticate(Credentials credentials) {
        if (credentials == null) return false;
        String token = credentials.getToken();
        if (token == null) return false;
        // Example token validation
        return token.equals("VALID_TOKEN_123") || token.equals("ANOTHER_VALID_TOKEN");
    }
}
