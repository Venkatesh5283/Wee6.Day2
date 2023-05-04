package runnerAssignment;

import baseclassAssignment.BaseClassAssignment;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/SalesforceAssignment.feature",glue="pagesAssignment",monochrome=true,publish=true)
public class RunnerClass extends BaseClassAssignment {

}
