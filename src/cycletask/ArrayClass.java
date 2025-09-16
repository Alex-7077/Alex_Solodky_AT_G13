package cycletask;

import java.util.Random;

public class ArrayClass {

    public int[] getArray() {
        return array;
    }

    int[] array = new int[7];

    Random random = new Random();

    public ArrayClass() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(999);
        }
    }

}
