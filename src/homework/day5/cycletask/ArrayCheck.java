package homework.day5.cycletask;


public class ArrayCheck {
    public void arrayCheck() {
        ArrayClass arrayClass = new ArrayClass();


        int[] array = arrayClass.getArray();
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }
    }
}
