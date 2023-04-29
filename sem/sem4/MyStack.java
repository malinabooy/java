package sem.sem4;

public class MyStack {
    private static int[] array;

    public static void main(String[] args) {
        array = new int[0];

        push (1);
        push (2);
        push (3);

        for (int i = 0; i < size (); i++)
            System.out.println(array[i]);

        System.out.printf("Size = %d\n", size ());
    }

    public static int size () {
        return array.length;
    }

    public static void push (int element) {
        int[] newArray = new int[size () + 1];
        for (int i = 0; i < size (); i++)
            newArray[i] = array[i];
        newArray[size ()] = element;
        array = newArray;
    }
}