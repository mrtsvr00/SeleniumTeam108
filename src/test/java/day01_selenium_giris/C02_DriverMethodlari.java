package day01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        jar dosyalarini yukleyerek selenium u kullanilir hale getirdik
        ancak herbir classin hangi browser ile calismasini istiyorsak
        o browser ile ilgili driver'i calistirmamiz lazim.

        Browser ile ilgili tercihimiz dogrultusunda
        ilgili ayarlari yapmak icin Javadaki System classindan setProperty() kullanilir

        method'a 2 parametre ekleyecegiz
        1.parametre herkes icin ayni : webdriver.chrome.driver
        2.parametre bu driver'in dosya yolu
        herkesin bilgisayarinda farkli olabilir
        windows bilgisayarlarda sonunda .exe yazilmalidir
        mac'lerde .exe olmaz
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // istenen sayfaya gitmek icin
        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);

        driver.close();
    }
}
