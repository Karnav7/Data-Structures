import java.util.Iterator;

public interface DynamiCArray<T> {
    public int size();
    public boolean isEmpty();
    public T getElementAt(int index);
    public void setElementAt(int index, T element);
    public void clear();
    public void addElement(T elem);
    public boolean removeElement(T elem);
    public T removeElementAt(int index);
    public int getIndexOf(T elem);
    public boolean contains(T elem);
    public Iterator<T> iterator();
}