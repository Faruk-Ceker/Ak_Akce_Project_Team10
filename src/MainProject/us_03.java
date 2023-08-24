package MainProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class us_03 extends BaseDriver {
@Test
        public void Test()
{

        driver.get("http://akakce.com/");
        WebElement girisyap=driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        girisyap.click();
        MyFunc.Wait(5);


      WebElement eMail=driver.findElement(By.cssSelector("input[id='life']"));
      eMail.sendKeys("hg@gmail.com");
    MyFunc.Wait(5);


    WebElement sifre=driver.findElement(By.cssSelector("input[id='lifp']"));
      sifre.sendKeys("123456Vs@");
    MyFunc.Wait(5);




    WebElement loginButton=driver.findElement(By.cssSelector("input[id='lfb']")) ;
      loginButton.click();
        MyFunc.Wait(5);


        WebElement accountIcon=driver.findElement(By.cssSelector("[title='Hesabım']"));

      accountIcon.click();

        MyFunc.Wait(5);


        WebElement exit=driver.findElement(By.cssSelector("[href='#Çık']"));
        exit.click();



    BekleVeKapat();








    }
}
