package homework.day1.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {

        TrainMethodsIf returnNewInt = new TrainMethodsIf();
        int result = returnNewInt.returnNewInt(returnNewInt.a);
        System.out.println("returnNewInt" + result);

        TrainMethodsIf returnNewLong = new TrainMethodsIf();
        long result2 = returnNewLong.returnNewLong(returnNewLong.b);
        System.out.println("returnNewLong" + result2);

        TrainMethodsIf returnNewChar = new TrainMethodsIf();
        String result3 = returnNewChar.returnNewChar(returnNewChar.c);
        System.out.println("returnNewChar" + result3);

        TrainMethodsIf returnNewFloat = new TrainMethodsIf();
        float result4 = returnNewFloat.returnNewFloat(returnNewFloat.d);
        System.out.println("returnNewFloat" + result4);

        TrainMethodsIf returnNewDouble = new TrainMethodsIf();
        double result5 = returnNewDouble.returnNewDouble(returnNewDouble.e);
        System.out.println("returnNewDouble" + result5);

        TrainMethodsIf returnNewBoolean = new TrainMethodsIf();
        String result6 = returnNewBoolean.returnNewBoolean(returnNewBoolean.k);
        System.out.println("returnNewBoolean" + result6);
    }
}