package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us_01 extends BaseDriver {

    /*
    PC_01

Test için kullanılacak tarayıcı (Chrome, Safari veya Firefox) yüklü ve başlatılmış durumda olmalıdır.

Test ortamında internet erişimi sağlanmalıdır.

Geçerli şifre enaz 8 karakterli olmalı; büyük-küçük harf ve rakam içermelidir

US_01

Bir kullanıcı olarak, https://www.akakce.com/  sitesinde hesap oluşturabilmeliyim. Böylece kendime özel bir alışveriş deneyimi yaşamış olurum.

AC_01

Kullanıcı adı, soyadı, e-posta, şifre, cinsiyet, doğum tarihi gibi bilgileri girerek hesap oluşturabilmelidir.
Doğru bilgiler girilerek hesap oluşturulduğunda, hesap doğrulama sayfasına yönlendirilir.
     */
    @Test
    public void Test1()
    {
        driver.get("https://www.akakce.com/");
        WebElement hesapAcButton = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[1]"));
        hesapAcButton.click();
        MyFunc.Wait(1);
        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("TestUser");
        MyFunc.Wait(1);
        WebElement soyad = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys("Tester");
        MyFunc.Wait(1);
        WebElement email = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email.sendKeys("cek1@example.com");
        MyFunc.Wait(1);
        WebElement emailTekrar = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        emailTekrar.sendKeys("cek1@example.com");
        MyFunc.Wait(1);
        WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("Password123");
        MyFunc.Wait(1);
        WebElement sifreTekrar = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreTekrar.sendKeys("Password123");
        MyFunc.Wait(1);
        WebElement erkekRadio = driver.findElement(By.xpath("//input[@id='rngm']"));
        erkekRadio.click();
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
        WebElement gunAc = driver.findElement(By.xpath("//select[@id='bd']"));
        gunAc.click();
        MyFunc.Wait(1);
        WebElement gunSec = driver.findElement(By.xpath("//select[@id='bd']/option[@value='1']"));
        gunSec.click();
        MyFunc.Wait(1);
        WebElement ayAc = driver.findElement(By.xpath("//select[@id='bm']"));
        ayAc.click();
        MyFunc.Wait(1);
        WebElement aySec = driver.findElement(By.xpath("//select[@id='bm']/option[@value='1']"));
        aySec.click();
        MyFunc.Wait(1);
        WebElement yilAc = driver.findElement(By.xpath("//select[@id='by']"));
        yilAc.click();
        MyFunc.Wait(1);
        WebElement yilSec = driver.findElement(By.xpath("//select[@id='by']/option[@value='1990']"));
        yilSec.click();
        MyFunc.Wait(1);

        WebElement kabulInput = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        kabulInput.click();
        MyFunc.Wait(1);
        WebElement sonHesapAc = driver.findElement(By.xpath("//input[@id='rfb']"));
        sonHesapAc.click();
        MyFunc.Wait(2);

        WebElement hesabim = driver.findElement(By.xpath("//div[@id='HM_v8']"));
        hesabim.click();
        MyFunc.Wait(1);


        WebElement onayYazisi = driver.findElement(By.xpath("//div[@class='my_i']"));
        Assert.assertTrue("Onaylama yazısı görünmedi",onayYazisi.getText().contains("E-posta adresinizi onaylayın"));




        BekleVeKapat();
    }

}
