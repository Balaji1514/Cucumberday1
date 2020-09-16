package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
public static void generateJVMRrport(String jsonfile) {
File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");	
Configuration configuration = new Configuration(f, "Adactin Hotel Automation");
configuration.addClassifications("sprint", "10");
configuration.addClassifications("driver", "google");
configuration.addClassifications("OS", "win64");
List<String> jsonFiles = new ArrayList<String>();
jsonFiles.add(jsonfile);
ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
builder.generateReports();
}
}
