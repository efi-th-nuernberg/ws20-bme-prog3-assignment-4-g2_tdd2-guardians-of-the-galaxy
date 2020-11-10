import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

      //normal
        assertEquals(TriangleChecker.TriangleType.NORMAL, TriangleChecker.checkTriangle(a, b, c));
        

        //fehler
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(-3, 3, 4));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(3, -4, 3));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 5, -66));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(8, 1, -1));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(77, 5, 1));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 41, 7));

        //gleichschenklig
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle(11, 4, 11));

        //gleichseitig
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle(4, 4, 4));
    }

}
