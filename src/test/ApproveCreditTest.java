package test;

import main.ApproveCredit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApproveCreditTest {
    ApproveCredit approveCredit;

    @BeforeTest
    public void setup() {
        approveCredit = new ApproveCredit();
    }

    @Test
    public void approveCredit_ShouldReturnDeclinedTest() {
        String result = approveCredit.approveCredit(549);
        Assert.assertEquals(result, "Declined");
    }

    @Test
    public void approveCredit_ShouldReturnMaybeTest() {
        String result = approveCredit.approveCredit(551);
        Assert.assertEquals(result, "Maybe");
    }

    @Test
    public void approveCredit_ShouldReturnDoBusinessTest() {
        String result = approveCredit.approveCredit(676);
        Assert.assertEquals(result, "We look forward to doing business with you!");
    }
}
