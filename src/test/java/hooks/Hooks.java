package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Before Hooks");
    }

    @After
    public void tearDown(Scenario scenario){
       // System.out.println("After Hooks");
      //RUNS AFTER EACH SCENARIO
        //
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","failed_scenario");
        Driver.closeDriver();
        }

    }

}
