//package Report;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import org.testng.annotations.AfterTest;
//
//
//public class ExtentReporting  {
//
//    public static ExtentHtmlReporter report=null;
//    public static ExtentReports extent= null;
//    public static  ExtentTest test=null;
//    //public static String a= null;
//
//
//
//    public static ExtentReports setextentReporting ()
//    {
//        String location = "./main/Resources/report.html";
////        report= new ExtentHtmlReporter(location);
////        //report.setAppendExisting(true);
////        report.config().setTheme(Theme.STANDARD);
////        report.config().setDocumentTitle("This is a document title");
////        report.config().setReportName("This is report name");
////        report.start();
//
//        extent= new ExtentReports();
////        extent.attachReporter(report);
////        extent.setSystemInfo("OS", System.getProperty("os.name"));
//        //extent.start;
//        //a="hello";
//
//        return extent;
//
//
//
//
//
//    }
//
//
//    public static void endofTest()
//    {
//        extent.flush();
//        //System.out.println(a);
//    }
//
//}
//
//
