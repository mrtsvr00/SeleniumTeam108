package day01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println("maximazi size : " + driver.manage().window().getSize());
        System.out.println("maximaze pozition : " + driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("fullscrean size : " + driver.manage().window().getSize());
        System.out.println("fullscrean pozition : " + driver.manage().window().getPosition());

        driver.quit();



    }
}
