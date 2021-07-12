import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TrangleTest {
    @Test
    public void TestTrangle(){
        int side1= 1;
        int side2=1;
        int side3= 5;
        int expected = 0;
        int result = TriangleClassifier.Triangle(side1,side2,side3);
        assertEquals(expected,result);

    }
    @Test
    public void testIsoscelesTrangle(){
        int side1= 3;
        int side2=4;
        int side3= 5;
        int expected = 0;
        int result = TriangleClassifier.Triangle(side1,side2,side3);
        assertEquals(expected,result);
    }
    @Test
    public void testEquilateralTriangle(){
        int side1=4;
        int side2=4;
        int side3=4;
        int expected =1;
        int result= TriangleClassifier.Triangle(side1,side2,side3);
        assertEquals(expected,result);
    }

}
