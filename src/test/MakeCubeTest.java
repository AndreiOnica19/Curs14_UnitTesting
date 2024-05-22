package test;

import main.MakeCube;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeCubeTest {
    @Test
    public void makeCube_ShouldReturnLongTest() {
        MakeCube makeCube = new MakeCube();
        long result = makeCube.makeCube(3);
        Assert.assertEquals(result, 27);
    }
}
