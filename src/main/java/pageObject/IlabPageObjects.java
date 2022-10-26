package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class IlabPageObjects extends BaseClass {
//   WebDriver driver;

//	private static Logger logger = LogManager.getLogger(IlabPageObjects.class);
	private static Logger loggerObj = LogManager.getLogger(IlabPageObjects.class);
	public static HashMap<String, String> storeValue = new HashMap<>();

	public IlabPageObjects(WebDriver driver)
	{
	super(driver);

	}


//	private final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(IlabPageObjects.class);
//	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(IlabPageObjects.class);
	@FindBy(linkText="Career Opportunities")
	private WebElement  careerLnk;

	@FindBy(xpath="(//a[text()='Career Opportunities'])[1]")
	private WebElement careerLnk2;

	@FindBy(xpath="//a[text()='Get in Touch']")
	private WebElement getInTouch;
	private By getclickCareeLinkTxt = By.xpath("(//a[text()='Career Opportunities'])[1]");

	private By getValidateMsg = By.xpath("(//label[text()='Please complete all required fields.'])[1]");

	@FindBy(linkText="South Africa")
	private WebElement SouthAfricaLnk;



	@FindBy(xpath="//a[text()='Training']")
	private WebElement trainingLnk;

	@FindBy(xpath="(//a[text()='contact us'])[1]")
	private WebElement contactus;

	@FindBy(xpath="(//div[@class='et_pb_module et_pb_text et_pb_text_1  et_pb_text_align_left et_pb_bg_layout_light']/div/ul/li/a)[1]")
	private WebElement firstjoblink;
	@FindBy(name="message")
	private WebElement textAreaMsg;

	@FindBy(xpath="//a[text()='Apply Online ']")
	private WebElement aplyBtn;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement input_name;
	@FindBy(name="email")
	private WebElement input_email;
	@FindBy(name="phone")
	private WebElement input_phone;
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement input_msg;
	@FindBy(xpath="//div[@class='et_pb_module et_pb_text et_pb_text_1  et_pb_text_align_left et_pb_bg_layout_light']/div/ul/li")
	private List <WebElement> JobApplink;
	@FindBy(xpath="/a")
	private WebElement jobslnk;
	@FindBy(css="[value='Submit']")
	private WebElement btn_submit;
	@FindBy(xpath="//iframe[contains(@id,hs-form-iframe-)][1]")
	private WebElement iframe;
	@FindBy(name="lastname")
	private WebElement txtSurName;
	@FindBy(xpath = "//label[@class='hs-main-font-element']")
	private WebElement txtValidation;


	@FindBy(xpath="//ul[@class='wpjb-errors']/parent::div[@class='wpjb-field']/child::div/following-sibling::ul")
	private WebElement txt_validation;


	public  String getCellNumber(){
		int serviceProviderCode = (int)(Math.random() * (99 - 60) + 60);
		int threeDigitsNumber = (int)(Math.random() * (999 - 100) + 100);
		int fouDegitsNumber = (int)(Math.random() * (9999 - 1000) + 1000);
		String forMatedNumber = "0"+serviceProviderCode+" "+threeDigitsNumber+" "+fouDegitsNumber ;
		return forMatedNumber;


	}




	public boolean clickCareeLink() throws InterruptedException{
		seleniumAdaptor.pauseFor(5);
		System.out.println("The careerLnk is not clicked");
		if(
//		seleniumAdaptor.JavaScriptClick(careerLnk);
//				seleniumAction.WaitFoElementToBeVisible(careerLnk)
		seleniumAction.clickElement(careerLnk)
//		careerLnkcareerLnk.click
//		seleniumAdaptor.JavaScriptClick(careerLnk);
		){
//			seleniumAction.clickElement(careerLnk);
//			System.out.println("The careerLnk is not clicked");
//			seleniumAdaptor.JavaScriptClick(careerLnk);
			System.out.println("The careerLnk is clicked");
			System.out.println("The careerLnk is clicked");
		return true;
		}
		return  false;
			}

			public void click(){
				seleniumAdaptor.pauseFor(5);
				seleniumAdaptor.JavaScriptClick(careerLnk);
//				careerLnk.click();
			}

	public void GetInTouch(){
		seleniumAdaptor.pauseFor(5);
		System.out.println("The getInTouch is not clicked");
		seleniumAdaptor.JavaScriptClick(getInTouch);
		System.out.println("The getInTouch is clicked");
//				careerLnk.click();
	}

	public boolean clickcareermouseover() {
		if(
				seleniumAction.hoverMouseOverElement(By.xpath("//a[text()='Get in Touch']"))){
			seleniumAdaptor.pauseFor(2);
			seleniumAdaptor.JavaScriptClick(careerLnk2);
			return true;
		}
		return  false;
	}




			public String getclickCareeLinkTxt1(){
//				seleniumAction.WaitFoElementToBeVisible(getclickCareeLinkTxt);
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
//		seleniumAdaptor.pauseFor(1);
		String amt = driver.findElement(this.getclickCareeLinkTxt).getText();
//				logger.info("The name is :" + amt)
				System.out.println("The name is :" + amt);
				return amt;
			}

	public boolean clickSouthAfrica() throws InterruptedException{
		if(seleniumAction.WaitFoElementToBeVisible(SouthAfricaLnk)){
			seleniumAction.clickElement(SouthAfricaLnk);
			return true;
		}
		return  false;
	}

	public boolean clicktraining() throws InterruptedException{
		if(
//				seleniumAdaptor.pauseFor(5);

				seleniumAction.WaitFoElementToBeVisible(trainingLnk)){
			seleniumAdaptor.pauseFor(5);
			System.out.println("The trainingLnk is not clicked");
			seleniumAdaptor.JavaScriptClick(trainingLnk);
			System.out.println("The trainingLnk is clicked");
			return true;
		}
		return  false;
	}

	public void clicktraining1(){
		seleniumAdaptor.pauseFor(5);
		System.out.println("The trainingLnk is not clicked");
		seleniumAdaptor.JavaScriptClick(trainingLnk);
		System.out.println("The trainingLnk is clicked");
		loggerObj.debug("Print Logger");
		loggerObj.info("Print Logger");
//				careerLnk.click();
	}

	public boolean clicktraining2(){
		try{
			seleniumAdaptor.pauseFor(2);
			System.out.println("The trainingLnk is not clicked");
			seleniumAdaptor.JavaScriptClick(trainingLnk);
//			loggerObj.debug("Print Logger");
			loggerObj.info("The trainingLnk is clicked");

		return true;
	    } catch(Exception var2) {
		return false;
	}
	}


	public boolean clickcontactus() throws InterruptedException{
		if(seleniumAction.WaitFoElementToBeVisible(contactus)){
			seleniumAdaptor.JavaScriptClick(contactus);
			return true;
		}
		return  false;
	}

	public boolean clickcontactus1(){
		try{
//			seleniumAdaptor.pauseFor(2);
			System.out.println("The contactus is not clicked");
			seleniumAdaptor.JavaScriptClick(contactus);
			System.out.println("The contactus is clicked");
			return true;
		} catch(Exception var2) {
			return false;
		}
	}

public boolean swichToFrame(){
		seleniumAction.SwitchToIframe(iframe);
		return  true;
}


	public boolean clickFirstJob() throws InterruptedException{
		if(seleniumAction.WaitFoElementToBeVisible(firstjoblink)){
			seleniumAction.clickElement(firstjoblink);
			return true;
		}
		return  false;
	}


	public boolean CaptureName(String name){
		if(seleniumAction.WaitFoElementToBeVisible(input_name)){
		seleniumAction.typeText(input_name,name);
		return true;
		}
		return false;
	}

	public boolean CaptureName1(String name){
		try{
//			seleniumAdaptor.pauseFor(2);
			System.out.println("The inputname is not clicked");
			seleniumAdaptor.JavaScriptClick(input_name);
			seleniumAction.clearText(input_name);
			seleniumAction.typeText(input_name,name);
			System.out.println("The inputname is clicked");

			return true;
		} catch(Exception var2) {
			return false;
		}
	}
	public boolean CaptureSurname(String surName){
		if(seleniumAction.WaitFoElementToBeVisible(txtSurName)){
			seleniumAction.typeText(txtSurName,surName);
			return true;
		}
		return false;
	}

	public boolean CaptureSurname1(String surName){
		try{
//			seleniumAdaptor.pauseFor(2);
			System.out.println("The CaptureSurname is not clicked");
			seleniumAdaptor.JavaScriptClick(txtSurName);
			seleniumAction.clearText(txtSurName);
			seleniumAction.typeText(txtSurName,surName);
			System.out.println("The CaptureSurname is clicked");

			return true;
		} catch(Exception var2) {
			return false;
		}
	}
	public boolean CaptureMsg(String msg){
		if(seleniumAction.WaitFoElementToBeVisible(textAreaMsg)){
			seleniumAction.typeText(textAreaMsg,msg);
			return true;
		}
		return false;
	}

	public boolean CaptureMsg1(String msg){
		try{
//			seleniumAdaptor.pauseFor(2);
			System.out.println("The msg is not clicked");
			seleniumAdaptor.JavaScriptClick(textAreaMsg);
			seleniumAction.clearText(textAreaMsg);
			seleniumAction.typeText(textAreaMsg,msg);
			System.out.println("The msg is clicked");

			return true;
		} catch(Exception var2) {
			return false;
		}
	}
	public boolean TypeEmail(String email){
		if(seleniumAction.WaitFoElementToBeVisible(input_email)){
			seleniumAction.clickElement(input_email);
			seleniumAction.typeText(input_email,email);
			return true;
		}
		return false;

	}

	public boolean TypeEmail1(String email){
		try{
//			seleniumAdaptor.pauseFor(2);
			System.out.println("The email not clicked");
			seleniumAdaptor.JavaScriptClick(input_email);
			seleniumAction.clearText(input_email);
			seleniumAction.typeText(input_email,email);
			System.out.println("The email is clicked");

			return true;
		} catch(Exception var2) {
			return false;
		}
	}

	public boolean TypeCellNum(){
		if(seleniumAction.WaitFoElementToBeVisible(input_phone)){
			seleniumAction.typeText(input_phone,getCellNumber());
			return true;
		}
		return false;

	}

	public boolean TypeCellNum1(){
		try{
//			seleniumAdaptor.pauseFor(2);
			System.out.println("The TypeCellNum1 not clicked");
			seleniumAdaptor.JavaScriptClick(input_phone);
			seleniumAction.clearText(input_phone);
			seleniumAction.typeText(input_phone,getCellNumber());
			System.out.println("The TypeCellNum1 is clicked");

			return true;
		} catch(Exception var2) {
			return false;
		}
	}


	public boolean clickAndValidateMsg() throws InterruptedException {

		if(seleniumAction.WaitFoElementToBeVisible(btn_submit)){
			seleniumAction.clickElement(btn_submit);
		    String actualString = txtValidation.getText();
			assertTrue(actualString.contains("Please complete all required fields."));
			return true;
		}
		return false;

	}

	public String getValidateMsg(){

		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		seleniumAdaptor.pauseFor(1);
		String msg = driver.findElement(this.getValidateMsg).getText();
//				logger.info("The message is :" + msg);
		System.out.println("The message is :" + msg);
		return msg;
	}

	public void putValue(String vname, String vvalue) {
		storeValue.put(vname, vvalue);
	}


	public String getValue(String vname) {
		return storeValue.get(vname);
	}

	public void validate(String expectedResult, String actualResult) {
		Assert.assertEquals(expectedResult, actualResult);
	}


}


