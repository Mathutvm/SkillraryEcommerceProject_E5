package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	@FindBy (xpath ="//img[@id='Selenium Training']")
	private WebElement seleniumtraning;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	

	//initialization
	public  TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	//Utilization


	public WebElement getSeleniumtraning() {
		return seleniumtraning;
	}



	public WebElement getCarttab() {
		return carttab;
	}


	public void facebookicon() {
		facebook.click();
	}
	
}
