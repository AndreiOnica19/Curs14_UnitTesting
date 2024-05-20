package test;

import main.Mathematics;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MathematicsTest {

    Mathematics math;
    @BeforeTest
    public void setup() {
        math = new Mathematics();
    }

    @Test
    public void addTest() {
        // Arrange: este locul in care se pregateste terenul pentru a putea fi apelata metoda add;


        // Act: este locul in care actioneaza/se apeleaza metoda (se salveaza rezultatul metodei intr-o variabila);
        int actualResult = Mathematics.add(1, 2);
        int expectedResult = 3;

        // Assert: adeverim ca rezultatul este cel asteptat.
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplyTest() {
        // Metodele statice din alte clase se apeleaza prin numele clasei de care apartin;
        // Metodele non statice din alte clase se apeleaza printr-un obiect al clasei de care apartin.

        // Arrange
        // Mathematics math = new Mathematics();
        // Act
        int actualResult = math.multiply(2, 3);
        // Assert
        Assert.assertEquals(actualResult, 6);
    }

    @Test
    public void findMax_WhenFirstArgIsGreater_ShouldReturnFirstArgTest() {
        int actualResult = math.findMax(3, 2);
        Assert.assertEquals(actualResult, 3);
    }

    @Test
    public void findMax_WhenSecondArgIsGreater_ShouldReturnSecondArgTest() {
        int actualResult = math.findMax(2, 3);
        Assert.assertEquals(actualResult, 3);
    }

    @Test
    public void isEven_ShouldReturnTrueIfNumberIsEven(){
        boolean result = math.isEven(12);
        Assert.assertTrue(result);
    }
}
