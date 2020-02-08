package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import SeleniumBase.ProjectSpecificMethod;



public class TC001_Verify_Page_Title extends ProjectSpecificMethod{
	@Test
    public void runCreateAcme() throws InterruptedException {
  	  new LoginPage()
  	  .enterUsername()
  	  .enterPassword()
  	 .clickLogin()
  	 .verifyTitle()
  	 .close();
}
}
