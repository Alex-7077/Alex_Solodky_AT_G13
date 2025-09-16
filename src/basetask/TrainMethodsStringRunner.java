package basetask;

public class TrainMethodsStringRunner {
    String q = "мама мыла раму";
    String w = "проверка printString метода";
    public static void main(String[] args) {
        TrainMethodsString runner = new TrainMethodsString();
        TrainMethodsString.printMama();
        TrainMethodsString.printPapa();
        TrainMethodsString.printString(runner.w);
        TrainMethodsString.printMamaString(runner.q);
    }
}
