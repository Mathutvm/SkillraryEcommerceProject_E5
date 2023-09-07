package Scripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
@Test
public void tc2() throws Throwable {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	
	SkillraryDemoLoginPage sd =new SkillraryDemoLoginPage(driver);
	utilies.Switchingtabs(driver);
	utilies.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
	TestingPage tp=new TestingPage(driver);
	utilies.dragdrop(driver,tp.getSeleniumtraning(), tp.getCarttab());
}
}
