package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent{
    private String name;
    private List<FileComponent> list = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(FileComponent fileComponent){
        list.add(fileComponent);
    }

    @Override
    public int getSize() {
        int sum = 0;
        for (FileComponent fileComponent : list)
            sum += fileComponent.getSize();
        System.out.println("폴더이름: " + name + ", 전체 파일 크기: " + sum);
        return sum;
    }

    @Override
    public void remove() {
        for (FileComponent fileComponent : list)
            fileComponent.remove();
        System.out.println(name + "폴더를 삭제합니다.");
    }
}
