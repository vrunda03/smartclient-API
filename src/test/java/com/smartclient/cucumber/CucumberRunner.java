package com.smartclient.cucumber;

import com.smartclient.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
//@cucumberOption - provides additional configuration to the Runner
@CucumberOptions(features = "src/test/java/resources/feature/"
)

public class CucumberRunner extends TestBase {

}
