import java.util.Random;

public class DirtDetection {
    private boolean[][] dirtMap;
    private Random random;

    public DirtDetection(int maxX, int maxY) {
        dirtMap = new boolean[maxX][maxY];
        random = new Random();
        generateDirt();
    }

    private void generateDirt() {
        for (int i = 0; i < dirtMap.length; i++) {
            for (int j = 0; j < dirtMap[i].length; j++) {
                dirtMap[i][j] = random.nextBoolean(); // Randomly place dirt
            }
        }
    }

    public boolean isDirtAt(int x, int y) {
        return dirtMap[x][y];
    }

    public void cleanDirtAt(int x, int y) {
        if (dirtMap[x][y]) {
            dirtMap[x][y] = false;
            System.out.println("Dirt cleaned at (" + x + "," + y + ")");
        } else {
            System.out.println("No dirt found at (" + x + "," + y + ")");
        }
    }
}
