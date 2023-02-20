package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Q2 {

    /* ...Exercise2...
        1 - Java class'imiza chromedriver.exe'yi tanitalim
        2 - Driver olusturalim
        3 - Driver'in tum ekrani kaplamasini saglayalim
        4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklemesini
            söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        5 - "https://www.otto.de" adresine gidelim
        6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
        8 - Ardindan "https://wisequarter.com/" adresine gidelim
        9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
            kontrol edelim
        10- Bir onceki web sayfamiza geri donelim
        11- Sayfayi yenileyelim
        12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.otto.de");

        String title = driver.getTitle();
        System.out.println("ottoTitle " + title);
        String url = driver.getCurrentUrl();
        System.out.println("ottoUrl " + url);

        if (title.contains("otto") && url.contains("otto")){
            System.out.println("otto yazisini iceriyor");
        }else{
            System.out.println("otto yazisini icermiyor");
        }
        driver.get("https://wisequarter.com");
        String wiseTitle = driver.getTitle();

        if (title.contains("Quarter")){
            System.out.println("iceriyor");

        }else {
            System.out.println("icermiyor");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.close();
        driver.quit();








    }

}