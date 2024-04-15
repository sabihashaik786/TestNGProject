package April2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstClass {
  @Test
  public void login() {
	  Reporter.log("Excuting Login Test",true);
  }  
  @Test
  public void compose() {
	  Reporter.log("Excuting compose Test",true);
  }
  @Test
  public void reply() {
	  Reporter.log("Excuting reply Test",true);
  }  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Running in beforeMethod",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Running in afterMethod",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Running in beforeTest",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("Running in afterTest",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Running in beforeSuite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("Running in aftersuite",true);
  }

}
