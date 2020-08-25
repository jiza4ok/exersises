import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayIterator<T> implements Iterator<T> {

    private T[] arr;
    private int index = 0;

    public ArrayIterator(T[] arr){
        this.arr = arr;
    }

    public boolean hasNext() {
        return index <arr.length;
    }

    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return arr[index++];
    }

    public void remove() {

    }

}
