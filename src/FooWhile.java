public class FooWhile {
    public static void fooWhile() {
        int i = 23;
        while (i < 28) {
            if (i % 13 == 0) {
                System.out.println("Continue!");
                break;
                //return;
                //continue;
            }
            System.out.println("I is :" + i++);
        }
        System.out.println("number is" + i++);
    }
}
