package BehavioralPatterns.Visitor;

public class VisitorB implements Visitor{
    @Override
    public void visitSkt(Skt skt) {
        System.out.println(skt.getName() + " 통신사 입니다.");
    }

    @Override
    public void visitLg(Lg lg) {
        System.out.println(lg.getName() + " 통신사 입니다.");
    }
}
