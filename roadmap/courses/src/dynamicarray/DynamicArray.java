package dynamicarray;

public class DynamicArray {
    private int capacity;
    private int[] array;
    private int size;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity) {
            resize();
        }

        this.array[size] = n;
        this.size++;
    }

    public int popback() {
        if(size > 0) size--;
        return array[size];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];

        for(int i=0; i<size; i++) {
            newArray[i] = array[i];
        }
        array  = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
