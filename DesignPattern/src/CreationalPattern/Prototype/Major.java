package CreationalPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Major implements Cloneable{

    private List<String> list;

    public Major() {
        this.list = new ArrayList<>();
    }

    public Major(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void listAll() {
        this.list.add("Mobile");
        this.list.add("Network");
        this.list.add("OperatingSystem");
        this.list.add("Software");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Major(new ArrayList<>(this.list));
    }
}
