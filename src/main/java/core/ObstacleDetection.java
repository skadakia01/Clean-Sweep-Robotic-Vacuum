public class ObstacleDetection {
    private boolean[][] obstacleMap;

    public ObstacleDetection(int maxX, int maxY) {
        obstacleMap = new boolean[maxX][maxY];
        generateObstacles();
    }

    // Simulate obstacles
    private void generateObstacles() {
        for (int i = 0; i < obstacleMap.length; i++) {
            for (int j = 0; j < obstacleMap[i].length; j++) {
                if (Math.random() < 0.2) {
                    obstacleMap[i][j] = true;
                }
            }
        }
    }

    public boolean isObstacleAt(int x, int y) {
        return obstacleMap[x][y];
    }
}
