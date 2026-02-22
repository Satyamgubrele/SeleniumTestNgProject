package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.framework.utils.ExtentManager;
import com.aventstack.extentreports.*;

public class ExtentListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }
}