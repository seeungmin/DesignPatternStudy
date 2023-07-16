package StructuralPatterns.Composite;

public class FileLeaf implements FileComponent{
    private String name;
    private int size;

    public FileLeaf(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        System.out.println("파일 이름: " + name + ", 파일 크기: " + size);
        return size;
    }

    @Override
    public void remove() {
        System.out.println(name + "파일을 삭제합니다.");
    }
}
