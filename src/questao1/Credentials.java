package questao1;

public class Credentials {
    private String username;
    private String password;
    private String token;
    private String biometricData;

    public Credentials() {}

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getBiometricData() { return biometricData; }
    public void setBiometricData(String biometricData) { this.biometricData = biometricData; }
}
