public class FooFor {

    public void fooFor() {
        int e = 0;
        for (int i = 23; i <= 28; i++) {
            if (i % 13 == 0) {
                System.out.println("Continue!");
                //break;
                return;
                //continue;
            }
            e = i;
            System.out.println("i is :" + i);
        }
        System.out.println("number is :" + e);
    }
}

