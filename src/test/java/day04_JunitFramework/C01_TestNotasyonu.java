package day04_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    /*
    Framework : ortak calisma cercevesi
                hangi dosyalari nerede olusturacagimizi belirler boylece toplu calismayi kolaylastirir
                Her faramework dosya duzeni olusturmanin yaninda islerimizi kolaylastiran yeni ozllikler sunmustur

                JUnit framework en temel test frameworkudur
                Bize kazandirdigi ene onemli ozellik @Test Annotation (Notasyon)'dir

                @Test notasyonu sayesinde her bir method bagimsiz olarak calistirilabilen bir test methodu olur

                @Test notasyonu sayesinde istersek her bir test methodunu bagimsiz calistirabildigimiz gibi
                istenirse class levelden calistirip
                tum testlerin calismasini saglayabiliriz

                JUnit framaworkte test methodlarinin hangi sira ile calisacagini ONGOREMEYIZ VE KONTROL EDEMEYIZ
     */


    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.wisequarter.com");
    }

        @Test
        public void test02() {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            driver.get("https://www.youtube.com");
            driver.close();
        }
    }
