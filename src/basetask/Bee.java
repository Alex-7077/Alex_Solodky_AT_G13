package basetask;

public class Bee {
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String gender;
    int weight;

    public Bee(String gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public void printBeeDetails() {
        double result = weight / 500.0;
        System.out.println("Я легче лося в" + result + "раз");
    }
}
