package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Q3 {
    /* ...Exercise3...
        go to url : https://www.techlistic.com/p/selenium-practice-form.html
        fill the firstname
        fill the lastname
        check the gender
        check the experience
        fill the date
        choose your profession -> Automation Tester
        choose your tool -> Selenium Webdriver
        choose your continent -> Antartica
        choose your command  -> Browser Commands
        click submit button
 */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("murat" +Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sever" +Keys.ENTER);
        WebElement genderControl= driver.findElement(By.xpath("//input[@id='sex-0']"));
        genderControl.click();
        String cinsiyetSecim="Male";
        if (genderControl.equals(cinsiyetSecim)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        String experience = "3";
        WebElement experienceControl = driver.findElement(By.id("exp-2"));
        experienceControl.click();
        if (experienceControl.equals(experience)) {
            System.out.println("EXPERIENCE PASSED");
        }else {
            System.out.println("EXPERIENCE FAILED");
        }

        driver.findElement(By.id("datepicker")).sendKeys("01-01-2020");

        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).sendKeys("Antartica");
        driver.findElement(By.xpath("//*[text()='Browser Commands']")).click();
        driver.findElement(By.xpath("//*[@id='submit']")).click();




    }
}
