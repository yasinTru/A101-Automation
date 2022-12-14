package Framework;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import java.util.Properties;

//Hooks for project
public class Hooks {

    WebDriver driver;
    Properties properties;
    @Before


    public void before() {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = ConfigReader.initialize_Properties();
        driver = Framework.DriverSetup.initialize_Driver(browser);
    }

    @After
    public void after() {
        driver.quit();
    }
}