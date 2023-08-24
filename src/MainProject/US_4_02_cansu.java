package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_4_02_cansu extends BaseDriver {
    //1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
    //2. Kullanıcı ana sayfada "Giriş Yap" veya benzer bir seçeneği bulur ve tıklar.
    //3. Kullanıcı, geçersiz verileri girer:
    //4. E-posta: testuser@example.com
    //5. Şifre: InvalidPassword (geçersiz şifre)
   //6. "Giriş Yap" butonuna tekrar tıklar.

    @Test
    public void Test1(){

        driver.get("https://www.akakce.com/");

        WebElement giris=driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));   // giriş yapıldı
        giris.click();
        MyFunc.Wait(2);

        WebElement eposta=driver.findElement(By.xpath("//input[@id='life']"));    // dogru eposta
        eposta.sendKeys("flflfl@gmail.com");
        MyFunc.Wait(2);

        WebElement sifre=driver.findElement(By.xpath("//input[@id='lifp']"));    // yanlıs sıfre
        sifre.sendKeys("InvalidPassword");

        WebElement entry=driver.findElement(By.xpath("//input[@id='lfb']"));   // gırıs yap
        entry.click();

        MyFunc.Wait(7);

        WebElement uyari=driver.findElement(By.xpath("//p[text()='Şifre doğru değil. Lütfen kontrol edip yeniden deneyin.']"));
      //  System.out.println("uyari.getText() = " + uyari.getText());

        MyFunc.Wait(5);
        Assert.assertTrue("Hatalı şifre ile giriş yapıldı.",uyari.getText().contains("Şifre doğru değil. Lütfen kontrol edip yeniden deneyin."));


        BekleVeKapat();
    }
}
