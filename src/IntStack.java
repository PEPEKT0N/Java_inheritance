public class IntStack extends IntArray{
    int size;

    // ctor
    public IntStack() {
        super();
        size = 0;
    }
    public IntStack(int capacity) {
        super(capacity);
    }

    // getter & setter
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        if (size < 0 || size > getLength()) {
            throw new IllegalArgumentException("Invalid stack size");
        }
        this.size = size;
    }

    // methods
    public void pushItem(int item) {
        if (size >= getLength()) {
            throw new StackOverflowError("Stack is full");
        }
        setNumber(size, item);
        size++;
    }
    public int popItem() {
        if (size <= 0) {
            throw new IllegalStateException("Stack is empty");
        }
        size--;
        return getNumber(size);
    }
    public int peekItem() {
        if (size <= 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return getNumber(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(getNumber(i)).append(" ");
        }
        return sb.toString();
    }
    public String deepToString() {
        return java.util.Arrays.toString(getArray());
    }

}
