package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReports;
import com.pages.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src\\test\\resources" , glue = {"com.stepdefinition"}, monochrome = true,
plugin= {"pretty","json:src\\test\\resources\\Reports\\cucumber.json" }, snippets= SnippetType.CAMELCASE, strict= true, dryRun = false )
public class TestRunner extends BaseClass{
@AfterClass
	public static void afterclass() {
JVMReports.generateJVMRrport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\cucumber.json");

}
}
