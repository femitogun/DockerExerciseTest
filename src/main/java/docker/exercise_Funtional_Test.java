package docker;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class exercise_Funtional_Test {
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

    assertThat(driver.findElement(By.linkText("Let’s go!")).getText(), is("Let’s go!"));
    System.out.println("Let's go button is present");
    driver.quit();

    }
}
