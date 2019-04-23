package Tasks;

import static org.junit.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.Inject;

import org.junit.Assert;
import net.bytebuddy.asm.Advice.Exit;
import static io.magentys.cinnamon.webdriver.conditions.Conditions.ajaxFinished;
import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.*;
import io.magentys.cinnamon.webdriver.*;

public class LoginLogoutPageTask {

	WebDriver driver = new ChromeDriver();


	public void gotoLoginPage() {
		System.out.println("Launching Festicket Login Page");
		driver.get("https://www.festicket.com/");
		driver.manage().window().maximize();
	}

	public void clickLoginButton() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/main/nav/ul/li[6]/div/button/span/span")).click();
		System.out.println("Clicking Login Button successful");
	}

	public void enterUserName(String userId) {
		driver.findElement(By.cssSelector("#emailInput")).sendKeys(userId);
		System.out.println("user id successfully entered");

	}

	public void enterPassword(String password) {
		driver.findElement(By.id("passwordInput")).sendKeys(password);
		System.out.println("Password successfully entered");
	}

	public void clickFinalLoginButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.cssSelector("#submitButton > span")).click();

	}

	public void verifyHomePage() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		boolean is_homePage_displayed = driver
				.findElement(By.cssSelector(
						"#root > main > nav > div > a > svg.styles__c-sc-1ulk4xq-4.hEmqPR.sc-bMvGRv.TOlZx"))
				.isDisplayed();
		Assert.assertTrue("Unable to Login to home page",is_homePage_displayed);

	}
	
	public void exitBrowser() {
		driver.close();
	}

	public void clickLogoutButton() throws InterruptedException {
		driver.findElement(By.cssSelector(
				"#root > main > nav > ul > li.styles__c-sc-1wpb5od-4.dVpKgj > div > div > div.sc-jWBwVP.kKUTvp > span"))
				.click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.cssSelector(
				"#root > main > nav > ul > li.styles__c-sc-1wpb5od-4.dVpKgj > div > div > div.sc-eHgmQL.wUVOQ > div > a:nth-child(4)"))
				.click();
	}

	public void verifyLogout() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		boolean is_login_page = driver
				.findElement(By.cssSelector(
						"#root > main > nav > div > a > svg.styles__c-sc-1ulk4xq-4.hEmqPR.sc-bMvGRv.TOlZx"))
				.isDisplayed();
			Assert.assertTrue("Unable to Login to home page", is_login_page);
	}
}
