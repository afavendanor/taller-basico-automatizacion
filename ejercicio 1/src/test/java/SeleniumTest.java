import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

    @Before
    public void setup(){
        // TODO inicializar WebDriver
    }

    @Test
    public void testMustFillOutTheTestFormWithYourData(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.navigate().to("http://toolsqa.com/automation-practice-form/");

        WebElement firstname = webDriver.findElement(By.name("firstname"));
        firstname.sendKeys("Cesar Daniel");

        // TODO completar el llenado del formulario con sus datos

        WebElement gender = webDriver.findElement(By.id("sex-0"));
        gender.click();

        WebElement seleniumCommands = webDriver.findElement(By.id("selenium_commands"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", seleniumCommands);

        Select option = new Select(seleniumCommands);
        option.selectByVisibleText("Navigation Commands");

        webDriver.close();
        webDriver.quit();
    }

    @Test
    public void testMustFillOutTheTestFormWithOtherData(){
        // TODO completar el formulario con otros datos
    }

    @After
    public void tearDown(){
        // TODO Cerrar ventana actual del navegador
        // TODO Destruir la instancia del WebDriver
    }
}
