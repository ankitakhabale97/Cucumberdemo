package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features ="src/test/java/features",glue= {"Steps"},plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}) 
public class Runlog extends AbstractTestNGCucumberTests{

}
