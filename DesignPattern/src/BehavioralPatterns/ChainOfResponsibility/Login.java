package BehavioralPatterns.ChainOfResponsibility;

public class Login {
    private String id;
    private String password;
    private String securityCode;

    public Login(String id, String password, String securityCode) {
        this.id = id;
        this.password = password;
        this.securityCode = securityCode;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getSecurityCode() {
        return securityCode;
    }
}
