package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn returnNewInt = new TrainMethodsReturn();
        int result = returnNewInt.returnNewInt(returnNewInt.a);
        System.out.println("returnNewInt" + result);

        TrainMethodsReturn returnNewLong = new TrainMethodsReturn();
        long result2 = returnNewLong.returnNewLong(returnNewLong.b);
        System.out.println("returnNewLong" + result2);

        TrainMethodsReturn returnNewChar = new TrainMethodsReturn();
        char result3 = returnNewChar.returnNewChar(returnNewChar.c);
        System.out.println("returnNewChar" + result3 + result3);

        TrainMethodsReturn returnNewFloat = new TrainMethodsReturn();
        float result4 = returnNewFloat.returnNewFloat(returnNewFloat.d);
        System.out.println("returnNewFloat" + result4);

        TrainMethodsReturn returnNewDouble = new TrainMethodsReturn();
        double result5 = returnNewDouble.returnNewDouble(returnNewDouble.e);
        System.out.println("returnNewDouble" + result5);

        TrainMethodsReturn returnNewShort = new TrainMethodsReturn();
        short result6 = returnNewShort.returnNewShort(returnNewShort.f);
        System.out.println("returnNewShort" + result6);

        TrainMethodsReturn returnNewByte = new TrainMethodsReturn();
        byte result7 = returnNewByte.returnNewByte(returnNewByte.g);
        System.out.println("returnNewByte" + result7);

        TrainMethodsReturn returnNewBoolean = new TrainMethodsReturn();
        boolean result8 = returnNewBoolean.returnNewBoolean(returnNewBoolean.k);
        System.out.println("returnNewBoolean" + result8);


    }
}
