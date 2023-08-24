package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class us_02 extends BaseDriver {

    @Test

    public void TestUS02 () {
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(3);

        //Akakçe Hesap Doğrulama Kontrolü test senaryoları için verilerin değiştirileceği menu
        String cinsiyetSec ="Erkek";
        String ilSec = "Kocaeli";
        String ilceSec = "Kartepe";
        String dogumGunSec = "15";
        String dogumAySec = "12";
        String dogumYilSec = "1990";

        WebElement hesapAc = driver.findElement(By.xpath("(//a[@href='/akakcem/giris/?m=1&s=1'])[1]"));
        hesapAc.click();
        MyFunc.Wait(3);

        WebElement ad = driver.findElement(By.xpath("//input [@id='rnufn']"));
        ad.sendKeys("Ihs");
        MyFunc.Wait(3);

        WebElement soyad = driver.findElement(By.xpath("//input [@id='rnufs']"));
        soyad.sendKeys("USM");
        MyFunc.Wait(3);

        WebElement eposta = driver.findElement(By.xpath("//input [@id='rnufe1']"));
        eposta.sendKeys("usmi@gmail.com");
        MyFunc.Wait(3);

        WebElement epostaTekrar = driver.findElement(By.xpath("//input [@id='rnufe2']"));
        epostaTekrar.sendKeys("usmi@gmail.com");
        MyFunc.Wait(3);

        WebElement sifre = driver.findElement(By.xpath("//input [@id='rnufp1']"));
        sifre.sendKeys("A3@ihsan2");
        MyFunc.Wait(3);

        WebElement sifreTekrar = driver.findElement(By.xpath("//input [@id='rnufp2']"));
        sifreTekrar.sendKeys("A3@ihsan2");
        MyFunc.Wait(3);

        switch (cinsiyetSec) {
            case "Erkek":
                WebElement erkekOption = driver.findElement(By.xpath("//input [@id='rngm']"));
                erkekOption.click();
                break;
            case "Kadın":
                WebElement kadinOption = driver.findElement(By.xpath("//input [@id='rngf']"));
                kadinOption.click();
                break;
            default:
                System.out.println("Hatalı seçim!!!");
                break;
        }
        MyFunc.Wait(3);


        WebElement ilMenu= driver.findElement(By.xpath("//select[@id='locpr'and@name='locpr']"));
        ilMenu.click();
        MyFunc.Wait(3);

        WebElement ilSecDropdown = driver.findElement(By.xpath("//*[ text()='"+ilSec+"']"));
        ilSecDropdown.click();
        MyFunc.Wait(3);

        WebElement ilceMenu =driver.findElement(By.xpath("//select[@id='locds'and@name='locds']"));
        ilceMenu.click();
        MyFunc.Wait(3);

        WebElement ilceSecDropdown = driver.findElement(By.xpath("//*[ text()='"+ilceSec+"']"));
        ilceSecDropdown.click();
        MyFunc.Wait(3);

        WebElement dogumGunSecDropdown = driver.findElement(By.xpath("//select[@id='bd']/option[text()='" + dogumGunSec + "']"));
        dogumGunSecDropdown.click();
        MyFunc.Wait(3); // "//select[@id='bd' and @value='" + dogumGunSec + "']"

        WebElement dogumAySecDropdown = driver.findElement(By.xpath("//select[@id='bm']/option[text()='" + dogumAySec + "']"));
        dogumAySecDropdown.click();
        MyFunc.Wait(3);

        WebElement dogumYilSecDropdown = driver.findElement(By.xpath("//select[@id='by']/option[text()='" + dogumYilSec + "']"));
        dogumYilSecDropdown.click();
        MyFunc.Wait(3);
        WebElement ksozKabul = driver.findElement(By.xpath("//input [@id='rnufpca']"));
        ksozKabul.click();
        MyFunc.Wait(3);

        WebElement hesapAc2 = driver.findElement(By.xpath("//input [@id='rfb']")); //*[@id='C4w']/option[text()='E-posta adresinizi onaylayın'] //*[ contains( text(), 'E-posta adresinizi onaylayın' ) ]
        hesapAc2.click();
        MyFunc.Wait(3);

        WebElement profil = driver.findElement(By.xpath("//a[@rel='nofollow' and @id='H_a_v8' and @href='/akakcem/' and @title='Hesabım']"));
        profil.click();
        MyFunc.Wait(3);

        WebElement hesabim = driver.findElement(By.xpath("//a[text()='Hesabım']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(hesabim).click().perform();

        WebElement emailHesapDog = driver.findElement(By.xpath("//*[contains(text(), 'E-posta adresinizi onaylayın')]"));
        String emailOnay = emailHesapDog.getText();
        System.out.println("emailOnay = " + emailOnay);
        MyFunc.Wait(3);
        Assert.assertTrue("Bulunamadı", emailOnay.contains("E-posta adresinizi onaylayın"));

        BekleVeKapat();
    }
}


