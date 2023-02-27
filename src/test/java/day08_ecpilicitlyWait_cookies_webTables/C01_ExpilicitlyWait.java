package day08_ecpilicitlyWait_cookies_webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C01_ExpilicitlyWait {

    @Test
    public void Test01(){

        /*
        Implicitly wait test yaparken ihtiyacimiz olan beklemelerin cogunu halleder
        nadirende olsa bazi islemler icin imlicitlywait icin tanimlananan
        sureden daha fazla zamana ihtiyacimiz olabilir.

        ExplicitlyWait bir webElement uzerinde gerceklesecek
        TEK BIR gorev icin tanimlanir.

        Bunun icin hem webelement tanimlanmali hem de gorev tanimlanmali


         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        //explicitly wait kullanacaksak
        //A- bir wait objesi olustur

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

        // B- EGER Kullanacagimiz webElement locate edilebilir ise locate yapalim

        //WebElement itsGoneElementi = driver.findElement(By.xpath("//*[text()='It's gone!']"));

        // EGER locate etmemiz icin zaman ihtiyac varsa
        // Locate ve gorev tanimlamamyi tek satirda yapiyoruz

        WebElement itsGoneElementi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        Assert.assertTrue(itsGoneElementi.isDisplayed());

        driver.close();
    }
}
