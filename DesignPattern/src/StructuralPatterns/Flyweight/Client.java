package StructuralPatterns.Flyweight;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();
        Scanner sc = new Scanner(System.in);

        System.out.println("원하는 색을 입력해주세요: ");
        while (true){
            String input = sc.nextLine();

            Color color = (Color) ColorFactory.getColor(input);
            Ball ball = new Ball(color, (int)(Math.random()*10));

            ball.make();
        }
    }
}
