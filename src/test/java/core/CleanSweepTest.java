import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CleanSweepTest {
    private NavigationSystem navigation;
    private DirtDetection dirtDetection;
    private ObstacleDetection obstacleDetection;

    @Before
    public void setUp() {
        navigation = new NavigationSystem(10, 10);
        dirtDetection = new DirtDetection(10, 10);
        obstacleDetection = new ObstacleDetection(10, 10);
    }

    @Test
    public void testNavigationSystem() {
        navigation.moveRight();
        int[] position = navigation.getPosition();
        assertEquals(1, position[0]); // Check if the x-coordinate is updated
        assertEquals(0, position[1]); // Check if the y-coordinate remains the same
    }

    @Test
    public void testDirtDetection() {
        boolean isDirt = dirtDetection.isDirtAt(5, 5);
        dirtDetection.cleanDirtAt(5, 5);
        assertFalse(dirtDetection.isDirtAt(5, 5)); // After cleaning, it should return false
    }

    @Test
    public void testObstacleDetection() {
        boolean obstacle = obstacleDetection.isObstacleAt(3, 3);
        // You can manually check grid coordinates where obstacles were generated
        // and assert if the result matches your expectation
        assertTrue(obstacle); // If there's an obstacle, assertTrue
    }
}
