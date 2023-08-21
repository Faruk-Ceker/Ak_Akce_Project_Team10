package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us_01_Tc_02 extends BaseDriver {
    /*
    1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
2. Ana sayfada "Hesap Oluştur" seçeneğine tıklar.
3. Kullanıcı sadece bazı bilgileri eksik veya hatalı bir şekilde doldurur.
4. "Hesap Oluştur" butonuna tıklar.

- Eksik veya hatalı bilgi girişi yapılan alanlar:

- Kullanıcı adı,
- Soyadı,
- Cinsiyet,
- Doğum Tarihi

- Hesap oluşturma başarısız olur.
- Kullanıcıya eksik veya hatalı bilgi girişi hakkında bir hata mesajı gösterilir.
     */
    @Test
    public void Test2(){

        driver.get("https://www.akakce.com/");
        WebElement hesapAcButton = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[1]"));
        hesapAcButton.click();
        MyFunc.Wait(1);
        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("");
        MyFunc.Wait(1);
        WebElement soyad = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys("");
        MyFunc.Wait(1);
        WebElement email = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email.sendKeys("cek3@gmail.com");
        MyFunc.Wait(1);
        WebElement emailTekrar = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        emailTekrar.sendKeys("cek3@gmail.com");
        MyFunc.Wait(1);
        WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("Far123456");
        MyFunc.Wait(1);
        WebElement sifreTekrar = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreTekrar.sendKeys("Far123456");
        MyFunc.Wait(1);

        WebElement ilAc = driver.findElement(By.xpath("//select[@id='locpr']"));
        ilAc.click();
        MyFunc.Wait(1);
        WebElement ilSec = driver.findElement(By.xpath("//select[@id='locpr']/option[@value='48']"));
        ilSec.click();
        MyFunc.Wait(1);
        WebElement ilceAc = driver.findElement(By.xpath("//select[@id='locds']"));
        ilceAc.click();
        MyFunc.Wait(1);
        WebElement ilceSec = driver.findElement(By.xpath("//select[@id='locds']/option[@value='654']"));
        ilceSec.click();
        MyFunc.Wait(1);


        WebElement kabulInput = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        kabulInput.click();
        MyFunc.Wait(1);
        WebElement sonHesapAc = driver.findElement(By.xpath("//input[@id='rfb']"));
        sonHesapAc.click();
        MyFunc.Wait(2);

        WebElement bildirim = driver.findElement(By.xpath("//div[@class='alertX t2']"));
        Assert.assertTrue("Eksik bilgilerle hesap oluşturuldu",bildirim.getText().contains("Lütfen adınızı yazın"));





        BekleVeKapat();
    }
}
