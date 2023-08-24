package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_4_01_cansu extends BaseDriver {
    @Test
    public void Test1()
    {
//        PC_04
//        Kullanıcının hesabı (Kullanıcının e-posta adresi ve Kullanıcının şifresi) başarılı bir şekilde oluşturulmuş ve doğrulanmış olmalıdır.
//        US_04
//        Bir kullanıcı olarak, http://Akakce.com  sitesine giriş yapabilmeliyim. Böylece, kendimle ilgili tercihleri sisteme tekrar tekrar girmek zorunda kalmamış olurum.
//        AC_04
//        Kullanıcı verileri doğru olduğu zaman, giriş işlemi başarılı olmalı ve kullanıcı sisteme giriş yapabilmelidir.

        driver.get("https://www.akakce.com/");

        WebElement giris=driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        giris.click();
        MyFunc.Wait(2);

        WebElement eposta=driver.findElement(By.xpath("//input[@id='life']"));
        eposta.sendKeys("flflfl@gmail.com");
        MyFunc.Wait(2);

        WebElement sifre=driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("123456Aa");
        MyFunc.Wait(2);

        WebElement entry=driver.findElement(By.xpath("//input[@id='lfb']"));
        entry.click();

        WebElement mouseOver=driver.findElement(By.xpath("//a[@title='Hesabım']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(mouseOver).build(); // elementin üzerine gel mouse üzerinde etkinleştir
        aksiyon.perform(); // etki  yap etkinleştir.
        MyFunc.Wait(2);

        WebElement hesabim=driver.findElement(By.xpath("//a[text()='Hesabım']"));

        Assert.assertTrue("hata",hesabim.getText().contains("Hesabım")); //Hatalı assert seçimi düzeltildi.

        MyFunc.Wait(2);
        BekleVeKapat();
    }
}
