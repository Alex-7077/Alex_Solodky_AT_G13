package basetask;

public class TrainMethodsIf {
    int a = 1;
    long b = 13;
    char c = '&';
    float d = 1.3F;
    double e = 133;
    short f = 33;
    byte g = 3;
    boolean k = true;

    public int returnNewInt(int a) {
        if (a <= 8) {
            return a * 7;
        } else {
            return a / 4;
        }
    }

    public long returnNewLong(long b) {
        if (b > 300) {
            return b - 300;
        } else {
            return b + 20;
        }
    }

    public String returnNewChar(char c) {
        if (c == 'g') {
            return "go";
        } else {
            return "o";
        }
    }

    public float returnNewFloat(float d) {
        if (d == 0.67) {
            return d;
        } else {
            return d * 2;
        }
    }

    public double returnNewDouble(double e) {
        if (e > 30 && e < 80) {
            return e + 87;
        }
        if (e > 80 && e < 400) {
            return e - 87;
        }
        if (e > 400) {
            return e / 4;
        } else {
            return e;
        }
    }

    public String returnNewBoolean(boolean k) {
        if (k == true) {
            return "Я получил на вход значение истины";
        }else{
            return "Я получил на вход ложь";
        }
    }

}
