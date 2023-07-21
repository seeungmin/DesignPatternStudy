package StructuralPatterns.Bridge;

public class YonseiMilk extends Milk{
    private String category = "연세";

    public YonseiMilk(Fat fat){
        super(fat);
    }
    @Override
    public String getMilk() {
        return fat.getDensity() + " " + category + "우유입니다.";
    }
}
