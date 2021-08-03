package docker;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise_Non_Functional_Test {
    public static void main (String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/wp-admin/setup-config.php");
        driver.manage().window().setSize(new Dimension(1440, 830));
        {
            WebElement dropdown = driver.findElement(By.id("language"));
            dropdown.findElement(By.xpath("//option[. = 'English (UK)']")).click();

        }
        }
}
