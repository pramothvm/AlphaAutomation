package stepdefinition;

import Utility.PropertiesFileReader;
import base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObject.IlabPageObjects;
import pageObject.SearchPageObject;
import seleniumaction.SeleniumAction;
import seleniumadaptor.SeleniumAdaptor;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonSteps extends BaseClass {


    PropertiesFileReader obj = new PropertiesFileReader();
    SearchPageObject searchPageObject;
    SeleniumAction seleniumAction;
    SeleniumAdaptor seleniumAdaptor;
    public IlabPageObjects ilabPageObjects;
    private Scenario scenario;
    public static ExtentTest extentTest;
    //    private final Logger logger = Logger.getLogger(ILABFlow.class);
//  private static final Logger logger = logger.getLogger(ILABFlow.class);
    private static Logger logger = LogManager.getLogger(CommonSteps.class);

    public CommonSteps() {
    }

    public CommonSteps(WebDriver driver) {
        super(driver);
    }

    @Before
    public void initializeScenario(Scenario scenario) throws Exception {
        this.scenario = scenario;
        Properties properties = obj.getProperty();
        System.out.println(properties);
        openBrowser(properties.getProperty("browser.baseURL"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
//            takeScreenShot(scenario);

//            byte [] screenshotTaken=  ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
//            byte [] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshotTaken,"image/png", "error screen");

            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }

        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
    }


}
