package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_4_03_cansu extends BaseDriver {
    @Test
    public void Test1(){
//
//        1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
//        2. Kullanıcı ana sayfada "Giriş Yap" veya benzer bir seçeneği bulur ve tıklar.
//        3. "Giriş Yap" butonuna tekrar tıklar.

        driver.get("https://www.akakce.com/");

        WebElement giris=driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));  // giriş yapıldı
        giris.click();
        MyFunc.Wait(2);


        WebElement entry=driver.findElement(By.xpath("//input[@id='lfb']"));      // giriş yap
        entry.click();

        MyFunc.Wait(7);
        WebElement uyari=driver.findElement(By.xpath("//p[text()='Lütfen e-posta adresinizi yazın.']"));
        System.out.println("uyari.getText() = " + uyari.getText());
        MyFunc.Wait(5);

        Assert.assertTrue("Hatalı şifre ile giriş yapıldı.",uyari.getText().contains("Lütfen e-posta adresinizi yazın."));


        BekleVeKapat();











        BekleVeKapat();
    }
}
