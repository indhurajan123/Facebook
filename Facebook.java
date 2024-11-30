package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php/");
		Select day=new Select(driver.findElement(By.id("day")));
		Select month=new Select(driver.findElement(By.id("month")));
		Select year=new Select(driver.findElement(By.name("birthday_year")));
		day.selectByValue("30");
		month.selectByIndex(3);
		year.selectByVisibleText("1997");
		
	}

}
