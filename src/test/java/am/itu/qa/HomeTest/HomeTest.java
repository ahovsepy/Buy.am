package am.itu.qa.HomeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.BaseTest.BaseTest;
import am.itu.qa.HomePage.HomePage;

public class HomeTest extends BaseTest{

	
	@Test
	public void homeTest() throws InterruptedException {
	HomePage home = new HomePage(this.driver);
	Thread.sleep(3000);
	home.clickOnElementSettings();
	Assert.assertTrue(home.dropBoxIsDisplayed());
	//After step openned small window   where are  two buttons 
	//currency button  and  language button   
	home.clickOnElementLanguage();
	//After step  openned window where can  changed  language  
	home.clickOnElementLenguage_ENG();
	Assert.assertTrue(home.languageEngIsDisplayed());
	//Assert.assertTrue(home.languageRusIsDisplayed());
	//After step update  page buy.am  and  all  text  in page  buy.am
	//is  written  by english  language  and window is  clossed      
	Thread.sleep(3000);
	home.clickOnElementSettings();
	Assert.assertTrue(home.dropBoxIsDisplayed());
	//After step openned small window   where are  two buttons 
	//currency button  and  language button   
	home.clickOnElementLanguage();
	//After step  openned window where can  changed  language  
	home.clickOnElementLenguage_RUS();
	Assert.assertTrue(home.languageRusIsDisplayed());
	//After step update  page buy.am  and  all  text  in page  buy.am
	//is  written  by russian  language  and window is  clossed      
	//comment for commit	
	//urish comment  for commit

	
	}
}