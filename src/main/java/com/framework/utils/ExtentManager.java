package com.framework.utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getInstance() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/Report.html");

        spark.config().setReportName("Automation Report");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        return extent;
    }
}