package questao1;

public class App {
    public static void main(String[] args) {
        Authenticator auth = new Authenticator(new PasswordAuth());

        Credentials c1 = new Credentials();
        c1.setUsername("alice");
        c1.setPassword("s3cr3t");

        System.out.println("Password auth (alice/s3cr3t): " + auth.login(c1));

        // Switch to token authentication without changing App logic
        auth.setStrategy(new TokenAuth());
        Credentials c2 = new Credentials();
        c2.setToken("VALID_TOKEN_123");
        System.out.println("Token auth (VALID_TOKEN_123): " + auth.login(c2));

        // Switch to biometric authentication
        auth.setStrategy(new BiometricAuth());
        Credentials c3 = new Credentials();
        c3.setBiometricData("BIO_OK");
        System.out.println("Biometric auth (BIO_OK): " + auth.login(c3));
    }
}
