package basetask;

public class TrainMethodsPrimitive {
    int a = 1;
    long b = 13;
    char c = '&';
    float d = 1.3F;
    double e = 133;
    short f = 33;
    byte g = 3;
    boolean k = true;
    public static void printInt(int a){
        System.out.println("я получил на вход число");
    }
    public static void printLong(long b){
        System.out.println("я получил на вход  длинное число " + b);
    }
    public static void printChar(char c){
        System.out.println("я получил на вход символ" + c);
    }
    public static void  printFloat(float d){
        System.out.println("я получил на вход дробное число" + d);
    }
    public static void  printDouble(double e){
        System.out.println("я получил на вход длинное дробное число" + e);
    }
    public static void  printShort(short f){
        System.out.println("я получил на вход короткое число " + f);
    }
    public static void  printByte(byte g){
        System.out.println("я получил на вход очень короткое число" + g);
    }
    public static void printBoolean(boolean k){
        System.out.println("я получил на вход булево" + k);
    }
}
