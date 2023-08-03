package BehavioralPatterns.ChainOfResponsibility;

public class SecurityCodeSupport extends Support{

    @Override
    public boolean check(Login login) {
        if(login.getSecurityCode().equals("1234")){
            return false;
        }
        check = 1;
        System.out.println("보안코드가 잘못되었습니다.");
        return true;
    }
}
