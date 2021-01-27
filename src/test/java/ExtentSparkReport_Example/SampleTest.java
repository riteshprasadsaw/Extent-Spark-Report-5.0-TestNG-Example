package ExtentSparkReport_Example;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ExtentITestListenerClassAdapter.class})
public class SampleTest {

    @Test
    public void passTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void failTest() {
        Assert.assertTrue(false);
    }

}