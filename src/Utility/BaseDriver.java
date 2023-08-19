package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    static // boyle yaparsak metodu direk çalıştırır ilk basta
            //bunun sartı extends olması ve başta yer alması
   // public static void DriverBaslat ()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //tam ekran yapar
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public static void BekleVeKapat (){
        MyFunc.Wait(5);
        driver.quit();
    }

}
//  Java hızlı - Web sitesi yavaş
// java elemanı bulmaya çalışıyor, ama web sitesi hala yuklenıyor. site yüklenmeden java bulamadım dıyor bıtırıyor,
// Web elementı bulmaya calıstıgında (FindElement/s)
//  çözüm 1 : biraz süre vereceğiz (20s)

//  Thread.sleep(); -> javayı direkt verilen süre kadar durdurur. kac sanıye verırsen o kadar durdurur programı. Osebeple bu işimize yaramıyor. Bize buldugu zaman cıksın yanı mesela 20 sn verdık 10. sanıyede java buldun cık, 20 sn beklemesın ısterız
//         bıde bu Thread.sleep ıyı kod degıldır mulakatta bundan bahsetme mesela.
//  bunun yerıne driver.manage yapıp bunu MyFunc a atıcam oradan cagırıyorum her seferınde yazmayayım dıye

//driverBaslat();   // extend aldık BaseDriverdan ondan cagırdık boyle
// driverBaslat(); ı yazmama gerek kalmadı neden?
// çünkü bu kodu her zaman mainde ilk başta çalışıyorsa o zaman sen bunu fınksıyon kullnamadan dırekt calıstırabılırsın dıyor java
//BaseDriver da önceden yaptıgımız   public static void driverBaslat()ı  --> static{ yaptık ve yukarıda buradan maınden sonra bır sey yazmadık
// zaten extends yaptıgımız ıcın BaseDriver dan bılıyor java maınden sonra bunu calıstıracagını