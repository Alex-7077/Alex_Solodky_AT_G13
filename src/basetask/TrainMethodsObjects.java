package basetask;

public class TrainMethodsObjects {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(13,"kakadu");
        mouse.printMouseDetails();
        Souce souce = new Souce("beluche", "красный");
        souce.printSouceDetails();
        Bee bee = new Bee("Bee",50);
        bee.printBeeDetails();
        Obstacle obstacle = new Obstacle("situation", "high");
        obstacle.printObstacleDetails();
        Pineapple pineapple = new Pineapple("vildona", 2140);
        pineapple.printPineappleDetails();

    }

}
