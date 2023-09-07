package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
//Declaration
	
	//ADDto cart 
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	
	//plusbutton
	@FindBy(id="add")
	private WebElement addbtn;
	
	

	//initialization
	public AddtocartPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	
	//Utilization
	public void cartbutton() {
		cartbtn.click();
	}
	
	public WebElement getAddbtn() {
		return addbtn;
	}
}
