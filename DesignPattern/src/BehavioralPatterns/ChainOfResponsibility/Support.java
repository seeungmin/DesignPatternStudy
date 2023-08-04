package BehavioralPatterns.ChainOfResponsibility;

public abstract class Support {
    private Support next;

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    public final void support(Login login){
        if (check(login))
            return;
        else if(next != null)
            next.support(login);
        else
            System.out.println("성공적인 로그인입니다.");
    }

    public abstract boolean check(Login login);
}
