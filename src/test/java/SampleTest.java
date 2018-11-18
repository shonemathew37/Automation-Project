import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTest extends Setup{
    @Test
    public void LogInPage() throws InterruptedException {
        //Open Facebook
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("Shone Mathew");
    }
}
