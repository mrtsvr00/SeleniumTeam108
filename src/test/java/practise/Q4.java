package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class Q4 {
    /* ...Exercise4...
        Navigate to  https://testpages.herokuapp.com/styled/index.html
        Click on  Calculater under Micro Apps
        Type any number in the first input
        Type any number in the second input
        Click on Calculate
        Get the result
        Print the result
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("calculatetest")).click();

        driver.findElement(By.id("number1")).sendKeys("5");
        driver.findElement(By.id("number2")).sendKeys("5");
        driver.findElement(By.id("calculate")).click();
        WebElement islemSonuc = driver.findElement(By.id("answer"));
        System.out.println(islemSonuc.getText());
        driver.close();

    }
}
