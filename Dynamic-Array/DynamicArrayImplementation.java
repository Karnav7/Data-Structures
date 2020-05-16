import java.util.Iterator;

class DynamicArrayImplementation<T extends Comparable<? super T>> extends AbstractDynamicList<T> {

    @Override
    public void addElement(T data) {
        T[] arr = getArr();
        int length = getLength();
        int capacity = getCapacity();
        System.out.println("Capacity: " + capacity);
        if ( length+1 > capacity ) {
            // System.out.println("yo");
            setCapacity(2 * capacity);
            T[] newArr = (T[]) new Comparable[2 * capacity];
            for ( int i = 0; i < length; i++ ) {
                newArr[i] = arr[i];
            }
            newArr[length] = data;
            setArr(newArr);
            
        } else {
            // System.out.println("nah");
            arr[length] = data;
            // System.out.println("test " + arr);
            setArr(arr);
            
        }
        setLength(length + 1);
        System.out.println("Element " + data + " was added successfully");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        System.out.println("Size of array is " + getLength());
        return getLength();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if ( getLength() == 0 ) {
            System.out.println("Array is empty");
            return true;
        }
        else {
            System.out.println("Array is not empty");
            return false;
        }
    }

    @Override
    public T getElementAt(int index) {
        // TODO Auto-generated method stub
        if ( index < 0 && index > getLength() )
            throw new IllegalArgumentException("Illegal Index: " + index);
        else {
            T data = getArrAt(index);
            System.out.println("Element at index " + index + " is " + data);
            return data;
        }
    }

    @Override
    public void setElementAt(int index, T element) {
        // TODO Auto-generated method stub
        if ( index < 0 && index > getLength() )
            throw new IllegalArgumentException("Illegal Index: " + index);
        else {
            setArrAt(index, element);
            System.out.println("Element " + element + " was set successfully at index " + index);
        }
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        for ( int i = 0; i < getLength(); i++ ) {
            setArrAt(i, null);
        }
        setLength(0);
        System.out.println("Array cleared successfully");
    }

    @Override
    public boolean removeElement(T elem) {
        // TODO Auto-generated method stub
        T[] arr = getArr();
        for ( int i = 0; i < getLength(); i++ ) {
            if ( arr[i].equals(elem) ) {
                removeElementAt(i);
                System.out.println("Element " + elem + " is removed successfully");
                return true;
            }
        }
        System.out.println("Element " + elem + " was not found");
        return false;
    }

    @Override
    public T removeElementAt(int index) {
        // TODO Auto-generated method stub
        if ( index < 0 && index > getLength() )
            throw new IllegalArgumentException("Illegal Index: " + index);
        
        T data = getArrAt(index);
        T[] newArr = (T[]) new Comparable[getLength() - 1];
        for ( int i = 0, j = 0; i < getLength(); i++, j++) {
            if ( i == index ) j--;
            else newArr[j] = getArrAt(i);
        }
        setArr(newArr);
        setLength(getLength() - 1);
        setCapacity(getLength() - 1);
        System.out.println("Element " + data + " is removed from index " + index);
        return data;
    }

    @Override
    public int getIndexOf(T elem) {
        // TODO Auto-generated method stub
        for ( int i = 0; i < getLength(); i++ ) {
            if ( getArrAt(i).equals(elem) ) {
                System.out.println("Index of Element " + elem + " is " + i);
                return i;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }

    @Override
    public boolean contains(T elem) {
        if ( getIndexOf(elem) != -1 ) {
            System.out.println("Element " + elem + " was found at index " + getIndexOf(elem));
            return true;
        } else {
            System.out.println("Element " + elem + " was not found");
            return false;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            public boolean hasNext() { return index < getLength(); }
            public T next() { return getArrAt(index++); }
        };
    }

    public void printArray() {
        T[] arr = getArr();
        int len = getLength();
        System.out.println("Dynamic Array: ");
        for ( int i = 0; i < getLength(); i++ ) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

}