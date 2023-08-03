package BehavioralPatterns.ChainOfResponsibility;

public class PassWordSupport extends Support{
    @Override
    public boolean check(Login login) {
        if(login.getPassword().equals("myPassword")){
            return false;
        }
        check = 1;
        System.out.println("비밀번호가 잘못되었습니다.");
        return true;
    }
}
