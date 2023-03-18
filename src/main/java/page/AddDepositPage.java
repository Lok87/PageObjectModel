package page;

import org.openqa.selenium.WebDriver;

public class AddDepositPage {

	public class AddDeposit extends BasePage {

		WebDriver driver; // Global

		// Every Page must have a constructor to invite the driver
		public AddDeposit(WebDriver driver) {
			this.driver = driver;
		}

	}



}
