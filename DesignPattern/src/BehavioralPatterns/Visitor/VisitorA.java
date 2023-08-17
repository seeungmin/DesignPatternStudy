package BehavioralPatterns.Visitor;

public class VisitorA implements Visitor{
    @Override
    public void visit(Skt skt) {
        System.out.println(skt.getName() + " 통신사 입니다.");
    }

    @Override
    public void visit(Lg lg) {
        System.out.println(lg.getName() + " 통신사 입니다.");
    }
}
