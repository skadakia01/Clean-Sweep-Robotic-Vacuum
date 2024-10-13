public class NavigationSystem {
    private int x, y; // Current position
    private int maxX, maxY; // Grid limits

    public NavigationSystem(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.x = 0; // Start at origin
        this.y = 0;
    }

    // Movement methods
    public void moveUp() {
        if (y < maxY) {
            y++;
            System.out.println("Moved Up. Current Position: (" + x + "," + y + ")");
        } else {
            System.out.println("Cannot move further up.");
        }
    }

    public void moveDown() {
        if (y > 0) {
            y--;
            System.out.println("Moved Down. Current Position: (" + x + "," + y + ")");
        } else {
            System.out.println("Cannot move further down.");
        }
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
            System.out.println("Moved Left. Current Position: (" + x + "," + y + ")");
        } else {
            System.out.println("Cannot move further left.");
        }
    }

    public void moveRight() {
        if (x < maxX) {
            x++;
            System.out.println("Moved Right. Current Position: (" + x + "," + y + ")");
        } else {
            System.out.println("Cannot move further right.");
        }
    }

    public int[] getPosition() {
        return new int[]{x, y};
    }
}
