package test;

import main.Puzzle;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PuzzleTest {
    Puzzle puzzle;
    @BeforeTest
    public void setup(){
        puzzle = new Puzzle();
    }

    @Test
    public void getWaterState_ShouldReturnLiquidTest (){
        String result = puzzle.getWaterState(1);
        Assert.assertEquals(result, "liquid");
    }

    @Test
    public void getWaterState_ShouldReturnGasTest (){
        String result = puzzle.getWaterState(101);
        Assert.assertEquals(result, "gas");
    }

    @Test
    public void getWaterState_ShouldReturnIceTest (){
        String result = puzzle.getWaterState(-1);
        Assert.assertEquals(result, "ice");
    }

    @Test
    public void playFizzBuzz_ShouldReturnFizzBuzz(){
        String result = puzzle.playFizzBuzz(15);
        Assert.assertEquals(result, "FizzBuzz");
    }

    @Test
    public void playFizzBuzz_ShouldReturnFizz(){
        String result = puzzle.playFizzBuzz(3);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void playFizzBuzz_ShouldReturnBuzz(){
        String result = puzzle.playFizzBuzz(5);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void playFizzBuzz_ShouldReturnNumber(){
        String result = puzzle.playFizzBuzz(4);
        Assert.assertEquals(result, String.valueOf(4));
    }
}
