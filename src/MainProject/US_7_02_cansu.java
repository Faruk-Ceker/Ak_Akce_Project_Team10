package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_7_02_cansu extends BaseDriver {

//gecerlı bılgılerle sısteme gırılır ama sılme ıslemı esnasında ıstenen sıfreyı yanlıs gırer

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

        WebElement mouseOver=driver.findElement(By.xpath("//a[@title='Hesabım']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(mouseOver).build();
        aksiyon.perform();
        MyFunc.Wait(2);

        WebElement hesabimBUTON=driver.findElement(By.xpath("//a[text()='Hesabım']"));    //hesabıma tıkladık
        hesabimBUTON.click();
        MyFunc.Wait(3);

        WebElement hesapSil=driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));     // hesap sil e tıkladık
        hesapSil.click();
        MyFunc.Wait(3);

        WebElement hesapSilSifre=driver.findElement(By.xpath("//input[@type='password']"));       // yanlıs sıfre gırıldı
        hesapSilSifre.sendKeys("123da");
        MyFunc.Wait(3);

        WebElement hesapSil2=driver.findElement(By.xpath("//input[@value='Hesabımı sil']"));
        hesapSil2.click();
        MyFunc.Wait(10);

        WebElement ekran=driver.findElement(By.xpath("//div[@class='alertX t2']/p"));            // ekrandakı yazınınn yerı
        MyFunc.Wait(2);


        Assert.assertTrue("hata",ekran.getText().contains("Mevcut şifrenizi doğru girdiğinizden emin olun."));

        MyFunc.Wait(2);
        BekleVeKapat();



    }
}
