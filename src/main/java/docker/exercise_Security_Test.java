package docker;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise_Security_Test {
    public static void main (String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/wp-admin/setup-config.php");
        driver.manage().window().setSize(new Dimension(1440, 830));
        {
            WebElement dropdown = driver.findElement(By.id("language"));
            dropdown.findElement(By.xpath("//option[. = 'English (UK)']")).click();
        }
        driver.findElement(By.cssSelector("option:nth-child(26)")).click();
        driver.findElement(By.id("language-continue")).click();
        driver.findElement(By.linkText("Let’s go!")).click();

        WebElement searchField = driver.findElement(By.name("dbname"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys("TestUsername");
        searchField.sendKeys(Keys.ENTER);

        driver.getTitle().contains("Error establishing a database connection");
        driver.quit();
        {

        }
    }
}
