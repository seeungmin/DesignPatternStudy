package BehavioralPatterns.ChainOfResponsibility;

public class IdSupport extends Support{
    @Override
    public boolean check(Login login) {
        if(login.getId().equals("myId")){
            return false;
        }
        check = 1;
        System.out.println("아이디가 잘못되었습니다.");
        return true;
    }
}
