package questao1;

public class Authenticator {
    private AuthStrategy strategy;

    public Authenticator(AuthStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AuthStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean login(Credentials credentials) {
        if (strategy == null) throw new IllegalStateException("No authentication strategy set");
        return strategy.authenticate(credentials);
    }
}
