import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Конструктор по умолчанию: ");
        IntArray arr1 = new IntArray();
        System.out.println(arr1);
        System.out.println("Конструктор с заданной длиной:");
        IntArray arr2 = new IntArray(10);
        System.out.println(arr2);
        int[] tmp = {5, -9, 13, 28, 0};
        System.out.println("Конструктор с переданным массивом:");
        IntArray arr3 = new IntArray(tmp);
        System.out.println(arr3);

        System.out.println("Получение массива:");
        int[] arr = arr3.getArray();
        System.out.println("int[] arr = " + Arrays.toString(arr));

        System.out.println("Установка массива:");
        int[] array = {-8, 54, 1, 22, 19, 111, -60};
        arr3.setArray(array);
        System.out.println("IntArray: " + arr3);

        System.out.println("Установка и получение длины:");
        System.out.println("Length: " + arr3.getLength());
        arr3.setLength(10);
        System.out.println("length: " + arr3.getLength());
        System.out.println(arr3);
        arr3.setLength(5);
        System.out.println("length: " + arr3.getLength());
        System.out.println(arr3);
        try {
            arr3.setLength(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Получение и установка элемента по индексу:");
        System.out.println("arr3[1]: " + arr3.getNumber(1));
        arr3.setNumber(1, 0);
        System.out.println("arr3[1]: " + arr3.getNumber(1));

        System.out.println("Работа со стеком:");
        IntStack stack = new IntStack(5);
        System.out.println("IntStack deepToString: " + stack.deepToString());
        System.out.println("Добавление элементов:");
        stack.pushItem(10);
        stack.pushItem(-5);
        stack.pushItem(99);

        System.out.println("size: " + stack.getSize());
        System.out.println("IntStack toString: " + stack);
        System.out.println("IntStack deepToString: " + stack.deepToString());

        System.out.println("Удаленный элемент: " + stack.popItem());
        System.out.println("Последний элемент: " + stack.peekItem());
        System.out.println("Добавление элемента:");
        stack.pushItem(555);
        System.out.println("stack: " + stack);
    }
}