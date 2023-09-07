package pomPages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkillraryDemoLoginPage {
//Declaration 
	//address of course 
	@FindBy(id="course")
	private WebElement coursetab;
	
	//addres of selenium traning 
	@FindBy (xpath ="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraning;
	
	//address of dropdown
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	

	//initialization
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}


	//utilization
	public WebElement getCoursetab() {
		return coursetab;
	}

public void seleniumtrainingtab() {
	seleniumtraning.click();
}



	public WebElement getCoursedd() {
		return coursedd;
	}



	
	
	//utilization
	
}
