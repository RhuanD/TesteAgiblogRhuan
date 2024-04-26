package runners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import reports.Reports;

@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdefinitions"
)
@RunWith(Cucumber.class)
public class TestRunner {
    @BeforeClass
    public static void initReports(){
        Reports.create("Desafio Agiblog", "Teste do blog do agibank");
    }

    @AfterClass
    public static void closeReports(){
        Reports.close();
    }
}
