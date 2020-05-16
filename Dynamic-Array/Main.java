
public class Main {

    public static void main(String[] args) {
        DynamicArrayImplementation dl = new DynamicArrayImplementation();
        dl.isEmpty();
        dl.addElement(1);
        dl.addElement(4);
        dl.addElement(6);
        dl.addElement(3);
        dl.isEmpty();
        dl.addElement(7);
        dl.addElement(2);
        dl.size();
        dl.getElementAt(4);
        dl.contains(7);
        dl.contains(10);
        dl.getIndexOf(6);
        dl.removeElement(4);
        dl.removeElementAt(1);
        dl.printArray();
    }
}