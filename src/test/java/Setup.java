import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup {

    public WebDriver driver;
    public String url = "https://www.facebook.com/";

    @BeforeTest
    public void loadingSetUp() {
        //To-Do
        // You need to download the chrome driver for your os and change the location
        // Comment next line of code only if WebDriver path is added to .bashrc file e.g. export PATH="/home/shone/WebDrivers:$PATH"
        // System.setProperty("webdriver.chrome.driver", "/home/shone/WebDrivers/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}