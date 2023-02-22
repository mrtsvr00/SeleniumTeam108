package day06_window_iframe_actionClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_Iframe extends TestBase {

    @Test
    public void test01(){
        // https://the-internet.herokuapp.com/iframe sayfasina gidin
        driver.get("https://the-internet.herokuapp.com/iframe");
        // "Your content goes here." yazisnin gorunur oldugunu test edin
        /*
        Bazen locate islemimizden emin olmamiza ragmen
        Locator calismaz
        Bunun sebebi kullanmak isr=tedigimiz webelementin
        bir iframe in child i olmasi olabilir

        Eger kullanmak istedigimiz webelement ana sayfa icine gomulen baska bir web sayfasinin elementi ise
        once gomulu sayfaya gecmemeiz gerekir

        HTML komutlarinda sayafa icerisine sayfa gomebilmek icin iframe tag'i kullanilir
        bizde istedigimiz elemnti kullanmak icin once
        o frame'e switch yapmaliyiz.

        1-gecis yapmak istediginiz frame'i locate edin
        2-switch to ile o frame'e gecis yapin
        3-sonra istediginiz element ile istediginiz islemi yapin.
         */
        WebElement frameElementi =driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameElementi);


        WebElement yaziElementi = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yaziElementi.isDisplayed());
        bekle(3);

        // Elemental Selenium linkine click yapin
        /*
            Bir frame'e gecis yaptiktan sonra oradan cikincaya veya baska bir frame'e gecinceye kadar
            driver o frame icinde kalir

            isimiz bittiginde veya baska frame'e gecmek istedigimizde
            once calisacagimiz yere gecis yapmaliyiz
         */
        driver.switchTo().parentFrame();// icice framelerde bir ust seviyeye cikar
        //driver.switchTo().defaultContent(); // direk anasayfaya cikar
        driver.findElement(By.linkText("Elemental Selenium")).click();

        bekle(2);
    }
}
