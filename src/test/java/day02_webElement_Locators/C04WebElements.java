package day02_webElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;

public class C04WebElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon ana sayfaya git

        driver.get("https://www.amazon.com");

        // arama kutusu locate edip bir webelement olarak kaydedin
        // id'si "twotabsearchtextbox"olan webelement seklinde locate edecegiz

        /*

        Driver'a web elwmnti tarif etme islemine locate ,
        bu tarifi yapabilmek icin kullanabilecegim degiskenlerede LOCATOR denir

        8 tane Locator vardir.
        Locator'larin 6 tanesi webelementin ozelliklerine baglidir
        - id
        - classname
        - name
        - tagname
        - linkText
        - particalLinkText
        Geriye kalan iki locator ise her turlu webelementi locate etmek icin kullanilabilir.
        - xpath
        - cssSelector

         */

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // arama kutusuna "Nutella" yazip aratin.

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Thread.sleep(3000);

        driver.close();





    }
}
