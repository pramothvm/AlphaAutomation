package stepdefinition;

import Utility.PropertiesFileReader;
import base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObject.IlabPageObjects;
import pageObject.SearchPageObject;
import seleniumaction.SeleniumAction;
import seleniumadaptor.SeleniumAdaptor;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ILABFlow extends BaseClass {

    PropertiesFileReader obj=new PropertiesFileReader();
    SearchPageObject searchPageObject;
    SeleniumAction seleniumAction;
    SeleniumAdaptor seleniumAdaptor;
    public IlabPageObjects ilabPageObjects;
    private Scenario scenario;
    public static ExtentTest extentTest;
//    private final Logger logger = Logger.getLogger(ILABFlow.class);
//  private static final Logger logger = logger.getLogger(ILABFlow.class);
private static Logger logger = LogManager.getLogger(ILABFlow.class);

    public ILABFlow() {
    }

    public ILABFlow(WebDriver driver) {
        super(driver);
    }

//    @Before
//    public void initializeScenario(Scenario scenario) throws Exception {
//        this.scenario = scenario;
//        Properties properties=obj.getProperty();
//        System.out.println(properties);
//        openBrowser( properties.getProperty("browser.baseURL"));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//    @After
//    public void tearDown(Scenario scenario) {
//        if(scenario.isFailed()) {
////            takeScreenShot(scenario);
//
////            byte [] screenshotTaken=  ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
////            byte [] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
////            scenario.attach(screenshotTaken,"image/png", "error screen");
//
//       TakesScreenshot ts =(TakesScreenshot) driver;
//       byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//       scenario.attach(src, "image/png", "screenshot");
//        }
//
//        try {
//            driver.quit();
//        }
//        catch(Exception e) {
//            System.out.println(String.valueOf(e));
//        }
//    }



//
//    @Before
//    public void Setup() {
//        ExtentHtmlReporter reporter  = new ExtentHtmlReporter();
//        this.scenario = scenario;
//        Properties properties=obj.getProperty();
//        System.out.println(properties);
//        openBrowser( properties.getProperty("browser.baseURL"));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }

//    @After
//    public void tearDown(Scenario scenario) {
//        if(scenario.isFailed()) {
//            takeScreenShot(scenario);
////            byte [] screenshotTaken=  ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
////            byte [] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
////            scenario.attach(screenshotTaken,"image/png", "error screen");
//        }
//
//        try {
//            driver.quit();
//        }
//        catch(Exception e) {
//            System.out.println(String.valueOf(e));
//        }
//    }


//    @AfterStep
//    public void attachScreenshot(Scenario scenario){
//
//        if(scenario.isFailed()) {
//
//            byte[] screenshotTaken = ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshotTaken, "image/png", "error screen");
//        }
//            try {
//            driver.quit();
//        }
//        catch(Exception e) {
//            System.out.println(String.valueOf(e));
//        }
//    }



    @Given("I want to apply from ILab side")
    public void iWantToApplyFromILabSide() throws InterruptedException {
        ilabPageObjects= new IlabPageObjects(driver);
        seleniumAdaptor=new SeleniumAdaptor(driver);
        takeScreenShotNew(this.scenario);
        takeScreenShotNew(this.scenario);
//        putValue("EPN",ilabPageObjects.getclickCareeLinkTxt1());
//        ExtentCucumberAdapter.addTestStepLog("This is good" + getValue("EPN"));
//        validate("", ilabPageObjects.getclickCareeLinkTxt1());

        seleniumAdaptor.pauseFor(2);
//       Assert.assertTrue("unable to click the careerLink",ilabPageObjects.clickCareeLink());

//        ilabPageObjects.click();

        ilabPageObjects.GetInTouch();
//       ilabPageObjects.clickcareermouseover();
        logger.info("career link clicked");
        takeScreenShotNew(this.scenario);
//        Reporter.addStepLog("The EPN");


    }


    @And("select south Africa link")
    public void selectSouthAfricaLink() throws InterruptedException {
        ilabPageObjects= new IlabPageObjects(driver);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        Assert.assertTrue("unable to click the careerLink",ilabPageObjects.clickSouthAfrica());
        logger.info("south Africa has been cicked");
//        Reporter.addStepLog("The nedlock id is");

    }

    @And("select the the advertised Jobs")
    public void selectTheTheAdvertisedJobs() throws InterruptedException {
        ilabPageObjects= new IlabPageObjects(driver);
        Assert.assertTrue("unable to click on the job application",ilabPageObjects.clickFirstJob());
        //ilabPageObjects.clickFirstPost();
        logger.info("first job has been clicked");
    }

    @And("click on the apply online link")
    public void clickOnTheApplyOnlineLink() {

    }

    @Then("i should be able to submit the application and quite the browser")
    public void iShouldBeAbleToSubmitTheApplicationAndQuiteTheBrowser() throws InterruptedException {
        ilabPageObjects= new IlabPageObjects(driver);
        seleniumAction=new SeleniumAction(driver);
        seleniumAdaptor=new SeleniumAdaptor(driver);

        seleniumAction.scrollBy("0","1400");

       Assert.assertTrue("unable to type in email address",ilabPageObjects.clickAndValidateMsg());
        validate("Please complete all required fields.", ilabPageObjects.getValidateMsg());
       seleniumAdaptor.pauseFor(2);
        putValue("MSG",ilabPageObjects.getValidateMsg());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        ExtentCucumberAdapter.addTestStepLog("The message is " + getValue("MSG"));
        takeScreenShotNew(this.scenario);

    }

    @And("I type in my personal details {string} and {string} {string} {string}")
    public void iTypeInMyPersonalDetailsAnd(String name, String surname, String email, String msg) {
        ilabPageObjects= new IlabPageObjects(driver);
        seleniumAction=new SeleniumAction(driver);

        Assert.assertTrue("unable to switch to frame",ilabPageObjects.swichToFrame());
        seleniumAction.scrollBy("0","1000");
        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureName(name));

        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureSurname(surname));
        Assert.assertTrue("unable to type in email address",ilabPageObjects.TypeEmail(email));
        Assert.assertTrue("unable to type in email address",ilabPageObjects.CaptureMsg(msg));
        Assert.assertTrue("unable to type in cell number",ilabPageObjects.TypeCellNum());
    }

    @Given("I want to click training")
    public void iWantToClickTraining() throws InterruptedException {
        ilabPageObjects= new IlabPageObjects(driver);
        seleniumAction=new SeleniumAction(driver);
        seleniumAdaptor=new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);

//        Assert.assertTrue("unable to click on the training",  ilabPageObjects.clicktraining1());
//                ilabPageObjects.clicktraining1();
        Assert.assertTrue("unable to click on the training",  ilabPageObjects.clicktraining2());
        ExtentCucumberAdapter.addTestStepLog("The message is  Clicked");


    }

    @And("I click on contact us")
    public void iClickOnContactUs() throws InterruptedException {

        ilabPageObjects= new IlabPageObjects(driver);
        seleniumAction=new SeleniumAction(driver);
        seleniumAdaptor=new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to click on the job application",ilabPageObjects.clickcontactus());

    }

    @And("I type in my details {string} and {string} {string} {string}")
    public void iTypeInMyDetailsAnd(String name, String surname, String email, String msg) {

        ilabPageObjects= new IlabPageObjects(driver);
        seleniumAction=new SeleniumAction(driver);
        seleniumAdaptor=new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to switch to frame",ilabPageObjects.swichToFrame());
        seleniumAction.scrollBy("0","1000");

//        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureName(name));
        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureName1(name));
//        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureSurname(surname));
        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureSurname1(surname));
//        Assert.assertTrue("unable to type in email address",ilabPageObjects.TypeEmail(email));
        Assert.assertTrue("unable to type in email address",ilabPageObjects.TypeEmail1(email));
//        Assert.assertTrue("unable to type in email address",ilabPageObjects.CaptureMsg(msg));
        Assert.assertTrue("unable to type in email address",ilabPageObjects.CaptureMsg1(msg));
//        Assert.assertTrue("unable to type in cell number",ilabPageObjects.TypeCellNum());
        Assert.assertTrue("unable to type in cell number",ilabPageObjects.TypeCellNum1());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(4);

    }







}


