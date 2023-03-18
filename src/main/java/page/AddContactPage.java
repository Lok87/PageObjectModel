package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {
	WebDriver driver;

	
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	
	
	
}







