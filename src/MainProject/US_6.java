package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_6 extends BaseDriver {
//    PC_06
//    Kullanıcının hesabı (Kullanıcının e-posta adresi ve Kullanıcının şifresi) başarılı bir şekilde oluşturulmuş ve doğrulanmış olmalıdır.
//    Mesaj kontrolü için sisteme login olunmalıdır.
//    US_06
//    Bir kullanıcı olarak, hesabıma giriş yaparak mesaj kutusunu kontrol edebilmeliyim. Böylece, bana özel kampanya ve bildirimleri kaçırmamış olurum.
//     AC_06
//    Kullanıcı, hesabına giriş yapar ve mesaj kutusuna yönlendirilir.
//    Mesaj kutusu boşsa, uygun bir mesaj görüntülenir.

    @Test
    public void Test(){
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
        MyFunc.Wait(2);

        WebElement mouseOver=driver.findElement(By.xpath("//a[@title='Hesabım']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(mouseOver).build(); // elementin üzerine gel mouse üzerinde etkinleştir
        aksiyon.perform(); // etki  yap etkinleştir.
        MyFunc.Wait(2);

        WebElement hesabimBUTON=driver.findElement(By.xpath("//a[text()='Hesabım']"));    //hesabıma tıkladık
        hesabimBUTON.click();
        MyFunc.Wait(3);

        WebElement msg=driver.findElement(By.xpath("//a[text()='Mesajlarım']"));
        msg.click();
        MyFunc.Wait(2);

        WebElement msgDetail=driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));

        Assert.assertTrue("hata",msgDetail.getText().contains("Listelenecek mesaj bulunamadı."));

       BekleVeKapat();

    }
}
