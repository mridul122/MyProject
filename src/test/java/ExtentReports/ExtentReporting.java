package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporting {

    static ExtentReports extent;

    public static ExtentReports config()
    {
        String path=System.getProperty("user.dir")+"/ExtRep/index.html";
        System.out.println(path);
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Practice Report");
        reporter.config().setDocumentTitle("Test results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("tester","mridul.das");
        return extent;
    }
}
