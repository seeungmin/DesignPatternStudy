package BehavioralPatterns.ChainOfResponsibility;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Support a = new NoSupport();
        Support id = new IdSupport();
        Support passWord = new PassWordSupport();
        Support securityCode = new SecurityCodeSupport();

        a.setNext(securityCode).setNext(id).setNext(passWord);

        for(int i = 0; i<4; i++){
            System.out.print("id를 입력하세요 : ");
            String cId = sc.nextLine();
            System.out.print("password를 입력하세요 : ");
            String cPW = sc.nextLine();
            System.out.print("securitycode를 입력하세요 : ");
            String cSC = sc.nextLine();
            a.support(new Login(cId, cPW, cSC));
        }
    }
}
