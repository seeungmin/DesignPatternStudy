package BehavioralPatterns.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap() {
            {
                put('x', 1);
                put('y', 2);
                put('z', 3);
            }
        };

        PostfixExpression postfixExpression = PostfixParser.parse("xyz+-");
        int result = postfixExpression.interpret(map);
        System.out.println(result);
    }
}
