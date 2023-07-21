package StructuralPatterns.Bridge;

public class Client {
    public static void main(String[] args) {
        Milk yonseiMilk = new YonseiMilk(new LowFat());
        Milk seoulMilk = new SeoulMilk(new HighFat());

        System.out.println("yonseiMilk = " + yonseiMilk.getMilk());
        System.out.println("seoulMilk = " + seoulMilk.getMilk());
    }
}
