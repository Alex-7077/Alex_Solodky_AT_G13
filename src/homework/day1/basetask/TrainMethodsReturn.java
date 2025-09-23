package homework.day1.basetask;

public class TrainMethodsReturn {
    int a = 1;
    long b = 13;
    char c = '&';
    float d = 1.3F;
    double e = 133;
    short f = 33;
    byte g = 3;
    boolean k = true;


    public int returnNewInt(int a) {
        return a * 3;
    }

    public long returnNewLong(long b) {
        return b - 4;
    }

    public char returnNewChar(char c) {
        return c;
    }

    public float returnNewFloat(float d) {
        return d / 2;
    }

    public double returnNewDouble(double e) {
        return e + 2;
    }

    public short returnNewShort(short f) {
        return (short) (f - 1);
    }

    public byte returnNewByte(byte g) {
        return (byte) (g * 2);
    }

    public boolean returnNewBoolean(boolean k) {
        return !k;
    }

}
