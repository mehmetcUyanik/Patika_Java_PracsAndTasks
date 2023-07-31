package Tasks.MyList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int size;
    private int capacity;


    public MyList() {
        this(10);
    }

    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    private void resize() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public void add(T data) {
        if (size == capacity) {
            resize();
        }
        array[size++] = data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedData = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return removedData;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T replacedData = array[index];
        array[index] = data;
        return replacedData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray(Class<T> clazz) {
        T[] newArray = (T[]) Array.newInstance(clazz, size);
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public void clear() {
        Arrays.fill(array, 0, size, null);
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish < 0 || start >= size || finish >= size || start > finish) {
            throw new IllegalArgumentException("Invalid start and finish indices.");
        }
        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}