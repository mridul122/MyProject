package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    ExtentReports extentReports = ExtentReporting.config();
    ExtentTest test;
    ThreadLocal <ExtentTest> threads = new ThreadLocal<ExtentTest>();

    @Override
    public void onTestStart(ITestResult result) {


        test = extentReports.createTest(result.getMethod().getMethodName());
        threads.set(test);

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        //test.log(Status.PASS,"Success");
        threads.get().log(Status.PASS,"Success");
    }

    @Override
    public void onTestFailure(ITestResult result)  {


try {
//        test.fail(result.getThrowable());
    threads.get().fail(result.getThrowable());
    threads.get().addScreenCaptureFromPath("/Users/mridul.das/Downloads/pegs1.jpg");
//        threads.get().addScreenCaptureFromPath("","");
}
catch (Exception e)
{

}
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

        extentReports.flush();

    }
}
