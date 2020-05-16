@SuppressWarnings("unchecked")
public abstract class AbstractDynamicList<T> implements DynamiCArray<T> {
    private T [] arr;
    private int length;
    private int capacity;

    public AbstractDynamicList() {
        this.capacity = 5;
        this.arr = (T[]) new Comparable[capacity];
        this.length = 0;
    }

    public AbstractDynamicList(int capacity) {
        if ( capacity < 0 )
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);

        this.capacity = capacity;
        this.arr = (T[]) new Comparable[capacity];
        this.length = 0;

    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int num) {
        this.length = num;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getArr() {
        return this.arr;
    }

    public T getArrAt(int index) {
        return this.arr[index];
    }

    public void setArrAt(int index, T data) {
        this.arr[index] = data;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }
}