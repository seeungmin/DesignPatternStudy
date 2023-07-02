package CreationalPattern.Prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        Major major = new Major();
        major.listAll();

        Major major1 = (Major) major.clone();
        Major major2 = (Major) major.clone();

        List<String> list1 = major1.getList();
        List<String> list2 = major2.getList();

        list1.add("Algorithm");
        list2.remove("Software");

        System.out.println("list = " + major.getList());
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }
}
