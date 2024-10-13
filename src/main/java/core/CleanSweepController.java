import java.util.Scanner;

public class CleanSweepController {
    public static void main(String[] args) {
        // Define grid size
        int gridX = 10;
        int gridY = 10;

        // Initialize systems
        NavigationSystem navigation = new NavigationSystem(gridX, gridY);
        DirtDetection dirtDetection = new DirtDetection(gridX, gridY);
        ObstacleDetection obstacleDetection = new ObstacleDetection(gridX, gridY);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (w: up, s: down, a: left, d: right, q: quit):");
            String command = scanner.nextLine();

            switch (command) {
                case "w":
                    if (!obstacleDetection.isObstacleAt(navigation.getPosition()[0], navigation.getPosition()[1] + 1)) {
                        navigation.moveUp();
                    } else {
                        System.out.println("Obstacle detected, cannot move up.");
                    }
                    break;
                case "s":
                    if (!obstacleDetection.isObstacleAt(navigation.getPosition()[0], navigation.getPosition()[1] - 1)) {
                        navigation.moveDown();
                    } else {
                        System.out.println("Obstacle detected, cannot move down.");
                    }
                    break;
                case "a":
                    if (!obstacleDetection.isObstacleAt(navigation.getPosition()[0] - 1, navigation.getPosition()[1])) {
                        navigation.moveLeft();
                    } else {
                        System.out.println("Obstacle detected, cannot move left.");
                    }
                    break;
                case "d":
                    if (!obstacleDetection.isObstacleAt(navigation.getPosition()[0] + 1, navigation.getPosition()[1])) {
                        navigation.moveRight();
                    } else {
                        System.out.println("Obstacle detected, cannot move right.");
                    }
                    break;
                case "q":
                    System.out.println("Shutting down...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }

            // Check for dirt and clean
            int[] currentPosition = navigation.getPosition();
            if (dirtDetection.isDirtAt(currentPosition[0], currentPosition[1])) {
                System.out.println("Dirt detected!");
                dirtDetection.cleanDirtAt(currentPosition[0], currentPosition[1]);
            }
        }
    }
}
