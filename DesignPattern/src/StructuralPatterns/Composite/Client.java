package StructuralPatterns.Composite;

public class Client {
    public static void main(String[] args) {
        FolderComposite folder = new FolderComposite("1번");

        FileComponent file = new FileLeaf("최종본", 1);
        FileComponent file1 = new FileLeaf("최종최종본", 2);

        folder.add(file);
        folder.add(file1);

        folder.getSize();
        folder.remove();

    }
}
