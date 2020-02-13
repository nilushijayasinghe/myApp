package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp ()throws Exception{

        System.setProperty("webdriver.chrome.driver","/home/nilushi/Documents/chatbot/myApp/libs/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(alwaysRun = true)
    public void firstTest()throws Exception{

        driver.get("https://www.google.com/");

    }

    @AfterClass(alwaysRun = true)
    public void tearDown()throws Exception{

        driver.quit();

    }




}
