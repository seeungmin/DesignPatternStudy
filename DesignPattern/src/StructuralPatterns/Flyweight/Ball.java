package StructuralPatterns.Flyweight;

public class Ball {
    private Color color;
    private int diameter;

    public Ball(Color color, int diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void make(){
        System.out.println("지름이 " + diameter + " 인 " + color.toString() + "색 공을 만들었습니다.");
    }
}
