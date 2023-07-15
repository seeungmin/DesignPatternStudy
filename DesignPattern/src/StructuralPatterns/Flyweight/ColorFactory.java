package StructuralPatterns.Flyweight;

import java.util.HashMap;

public class ColorFactory {
    public static final HashMap<String, Color> map = new HashMap<>();

    public static Color getColor(String ballColor){
        Color color = (Color)map.get(ballColor);

        if(color == null){
            color = new Color(ballColor);
            map.put(ballColor, color);
            System.out.println("새 Color 객체 생성");
        }
        return color;
    }
}
