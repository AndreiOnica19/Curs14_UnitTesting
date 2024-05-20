package test;

import main.SayHello;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SayHelloTest {

    @Test
    public void sayHello_ShouldReturnSayHello(){
        SayHello txt = new SayHello();
        String result =  txt.sayHello();
        Assert.assertEquals(result,"Hello World!");
    }
}
