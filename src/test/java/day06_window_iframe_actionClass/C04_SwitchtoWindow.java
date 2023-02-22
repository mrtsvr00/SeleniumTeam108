package day06_window_iframe_actionClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C04_SwitchtoWindow extends TestBase {

    @Test
    public void test01(){
        //  https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //  Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement ilkSayfaYaziElementi = driver.findElement(By.tagName("h3"));
        String expectedYazi = "Opening a new window";
        String actualYazi = ilkSayfaYaziElementi.getText();
        Assert.assertEquals(expectedYazi, actualYazi);
        String ilkSayfaWHD = driver.getWindowHandle();
        //  Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        bekle(2);
        //  Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();


        /*
            Eger switchtoNewWindow() methodu kullanilirsa
            driver yeni acilan sayfaya gecis yapar

            Acak bu method kullanilmadan
            bir link tiklandiginda, yeni bir sayfa aciliyorsa
            driver yeni sayfaya gecis yapmaz

            bizim yeni acilan handle i bulup
            driver'i o sayfaya gecirmemiz gereklidir.

            link'e click yaptigimizda acik 2 sayfamiz oluyor
            bunlardan bir tanesi windowHandle degerini kaydettigimiz ilk sayfa
            digeri ise window handle degerini bilmedigimiz ikinci sayfa

            biz getWindowHandles()methodu ile
            bir SET olarak iki sayfanin windowHandle degerlerini alabiliyoruz

            O set icerisinde
            ilk sayfa WHD'ine esit olmayan String'i
            ikinciSayfaWHD olarak atayabiliriz


         */
        Set<String> tumSayfalarWHDSeti = driver.getWindowHandles();

        String ikincisayfaWHD = "";

        for (String each:tumSayfalarWHDSeti
             ) {
            if (!each.equals(ilkSayfaWHD)){
                ikincisayfaWHD=each;
            }

        }
        //  Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        driver.switchTo().window(ikincisayfaWHD);
        expectedTitle = "New Window";
        actualTitle = driver.getTitle();
        bekle(2);

        Assert.assertEquals(expectedTitle,actualTitle);
        //  Sayfadaki textin “New Window” olduğunu doğrulayın.
        String ikinciSayfaYazi = driver.findElement(By.tagName("h3")).getText();
        expectedYazi = "New Window";
        Assert.assertEquals(expectedYazi, ikinciSayfaYazi);
        //  Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        driver.switchTo().window(ilkSayfaWHD);
        expectedTitle = "The Internet";
        actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        bekle(3);





    }
}
