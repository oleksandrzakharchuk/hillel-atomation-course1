package example.pageobject.itHillel.pageobject;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    /**
     * осуществление первоначальной настройки
     */
    @Before
    public void setUp() {
        //определение пути до драйвера и его настройка
        System.out.println("Start browser");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        //создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        System.out.println("Open website");
       // webDriver.get("https://ithillel.ua/");
       driver.get(ConfProperties.getProperty("loginpage")); }

    @After
    public void cleanUp(){
        System.out.println("Close browser");
        /*if (webDriver!=null)
            webDriver.quit();*/
    }
}