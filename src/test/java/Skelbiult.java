import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Skelbiult {
public WebDriver driver;
    @Test
    public void pageLoads() throws InterruptedException{
        driver.get("http://www.skelbiu.lt");
    }
    @Test
    public void searchFieldTest() throws InterruptedException{
        driver.get("http://www.skelbiu.lt");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.id("searchKeyword")).sendKeys("kugelis");
        driver.findElement(By.id("searchButton")).click();


    }
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
//    @AfterClass
//    public void afterClass(){
//        driver.quit();
//    }


}
