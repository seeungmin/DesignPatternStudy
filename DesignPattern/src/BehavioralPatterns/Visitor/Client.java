package BehavioralPatterns.Visitor;

public class Client {
    public static void main(String[] args) {
        Agency[] agencies = new Agency[]{
                new Lg(), new Skt()
        };

        Visitor a = new VisitorA();
        for(Agency agency : agencies)
            agency.accept(a);
        System.out.println("=========================");
        
        // 방문자 B 추가
        Visitor b = new VisitorB();
        for(Agency agency : agencies)
            agency.accept(b);
    }
}
