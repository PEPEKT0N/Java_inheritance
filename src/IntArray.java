import java.util.Arrays;

public class IntArray {
    int[] array;

    // ctor
    public IntArray() {}

    public IntArray(int size) {
        array = new int[size];
    }

    public IntArray(int[] array) {
        this.array =array;
    }

    // getters & setters
    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public int getLength() {
        return array.length;
    }
    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        if (array == null) {
            array = new int[length];
            return;
        }
        array = Arrays.copyOf(array, length);
    }

    // methods
    public int getNumber(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        return array[index];
    }
    public void setNumber(int index, int value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        array[index] = value;
    }

    @Override
    public String toString() {
        if (array == null) {
            return "Arrays is empty";
        }
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }



}
