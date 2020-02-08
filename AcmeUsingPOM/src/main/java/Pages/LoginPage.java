package Pages;

import SeleniumBase.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage enterUsername()
	{
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;
	}
	public LoginPage enterPassword()
	{
		driver.findElementById("password").sendKeys("leaf@12");
		return this;
	}
	public HomePage clickLogin()
	{
		driver.findElementById("buttonLogin").click();
		return new HomePage();
	}
}
