package runnerAssignment;


import org.testng.annotations.DataProvider;

import baseclassAssignment.BaseClassAssignmentThreadLocal;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/SalesforceAssignment.feature",glue="pagesAssignment",monochrome=true,publish=true)
public class RunnerClassThreadLocal extends BaseClassAssignmentThreadLocal {

	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
