package com.framework.utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            String reportDir = System.getProperty("user.dir") + "/reports";
            File folder = new File(reportDir);
            if (!folder.exists()) {
                folder.mkdirs();   // 🔥 Creates folder in Jenkins
            }

            String reportPath = reportDir + "/index.html";

            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setReportName("Automation Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);
        }

        return extent;
    }
}