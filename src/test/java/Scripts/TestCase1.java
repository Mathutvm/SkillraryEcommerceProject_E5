package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;


public class TestCase1 extends BaseClass{
@Test
public void tc1() {
	SkillraryLoginPage s= new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	utilies.Switchingtabs(driver);
	SkillraryDemoLoginPage sd= new SkillraryDemoLoginPage(driver);
	utilies.mouseHover(driver,sd.getCoursetab());
	sd.seleniumtrainingtab();
	AddtocartPage d=new AddtocartPage(driver);
	utilies.doubleClick(driver, d.getAddbtn());
	d.cartbutton();
	utilies.alterPopup(driver);
	
}


}
