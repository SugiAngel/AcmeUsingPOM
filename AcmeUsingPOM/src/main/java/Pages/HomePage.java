package Pages;

import SeleniumBase.ProjectSpecificMethod;


public class HomePage extends ProjectSpecificMethod{
	  public HomePage verifyTitle() throws InterruptedException
	  {
		  String title= driver.getTitle();
		  // driver.getTitle();
		   System.out.println("Title of page"+ title);
		   Thread.sleep(3000);
		  return this;
	  }
	  }

