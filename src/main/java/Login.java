import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/checkout-complete.html");
        WebElement inputName = driver.findElement(By.id("user-name"));
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputName.sendKeys("standard_user");
        inputPassword.sendKeys("secret_sauce");
        WebElement buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();
        
    }
}
