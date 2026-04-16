package questao1;

public class BiometricAuth implements AuthStrategy {
    @Override
    public boolean authenticate(Credentials credentials) {
        if (credentials == null) return false;
        String bio = credentials.getBiometricData();
        if (bio == null) return false;
        // Simulated biometric check
        return bio.equals("BIO_OK") || bio.equals("USER_BIO_SAMPLE");
    }
}
