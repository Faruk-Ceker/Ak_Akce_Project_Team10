package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


//PC_05
//
//        Kullanıcının hesabı (Kullanıcının e-posta adresi ve Kullanıcının şifresi) başarılı bir şekilde oluşturulmuş ve doğrulanmış olmalıdır.
//
//        Sipariş listesi kontrolü için sisteme login olunmalıdır.
//
//        US_05
//
//        Bir kullanıcı olarak, hesabıma giriş yaparak sipariş listesini kontrol edebilmeliyim. Böylece kontrol dışı alışveriş yapmamış olurum.
//
//        AC_05
//
//        Kullanıcı, hesabına giriş yapar ve sipariş listesine yönlendirilir.
//        Sipariş listesi boşsa, uygun bir mesaj görüntülenir.

public class us_05 extends BaseDriver {

    @Test
    public void Test()

    {


        driver.get("http://akakce.com/");
        WebElement girisyap=driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        girisyap.click();
        MyFunc.Wait(2);


        WebElement eMail=driver.findElement(By.cssSelector("input[id='life']"));
        eMail.sendKeys("hg@gmail.com");
        MyFunc.Wait(2);


        WebElement sifre=driver.findElement(By.cssSelector("input[id='lifp']"));
        sifre.sendKeys("123456Vs@");
        MyFunc.Wait(2);




        WebElement loginButton=driver.findElement(By.cssSelector("input[id='lfb']")) ;
        loginButton.click();
        MyFunc.Wait(2);

        WebElement accountIcon=driver.findElement(By.cssSelector("[title='Hesabım']"));
        accountIcon.click();


        MyFunc.Wait(2);
        WebElement hesabim=driver.findElement(By.cssSelector("div[id='HM_v8'] a"));
        hesabim.click();

        MyFunc.Wait(2);
        WebElement siparislerim=driver.findElement(By.cssSelector("a[href='/akakcem/siparislerim/']"));
        siparislerim.click();


        WebElement sonuc=driver.findElement(By.cssSelector("div[class='no-record']"));
        System.out.println(sonuc.getText());

        Assert.assertTrue("Sipariş listesi hatalı göründü",sonuc.getText().contains("Kayıtlı siparişiniz bulunmuyor."));







        BekleVeKapat();


    }
















}

