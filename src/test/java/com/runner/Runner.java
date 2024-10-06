package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Assignment.feature",
glue= {"io.step.definitions"},
monochrome=false,
plugin= {"html:Reports/report.html","json:Reports/report.json","junit:Reports\\report.xml"},
dryRun=false,
tags = "@Smoke")
public class Runner {

}
