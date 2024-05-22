package test;

import main.ReverseWord;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordTest {
    @Test
    public void reverseWord_ShouldReturnReversedWordTest() {
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.getReverseWord("hello");
        Assert.assertEquals(result, "olleh");
    }
}
