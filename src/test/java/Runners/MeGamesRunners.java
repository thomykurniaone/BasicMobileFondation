package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"json:target/results/megames/cucumber-report.json",  "html:target/megames",
                "junit:target/cucumber-reports/Cucumber.xml"},
        features = "src/test/resources/features",
        glue = "Steps",
        tags = "@SmokeTest"

)
public class MeGamesRunners extends BaseRunners
{

}
