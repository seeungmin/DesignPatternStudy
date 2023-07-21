package StructuralPatterns.Bridge;

public class SeoulMilk extends Milk{
    private String category = "서울";

    public SeoulMilk(Fat fat){
        super(fat);
    }
    @Override
    public String getMilk() {
        return fat.getDensity() + " " + category + "우유입니다.";
    }
}
