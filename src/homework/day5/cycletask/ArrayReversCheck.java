package homework.day5.cycletask;



public class ArrayReversCheck {
    public void arrayReversCheck() {
        ArrayClass arrayClass = new ArrayClass();
        int[] array = arrayClass.getArray();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i > 0 ? " " : ""));
        }
        System.out.println();
    }
}
