package Framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


//Element helpers for whole project
public class Helper {

    WebDriver driver;
    WebDriverWait wait;

    public Helper(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
    }

    public WebElement findElement(By elementName)
    {
        return driver.findElement(elementName);
    }

    public void click(By elementName)
    {
        findElement(elementName).click();
    }

    public void sendKey(By elementName, String text) {
        findElement(elementName).sendKeys(text);
    }

    public void checkElementVisible(By elementName) {
        wait.until(ExpectedConditions.visibilityOf(findElement(elementName)));
    }

    public String getText(By elementName) {
        return findElement(elementName).getText();
    }

    public WebElement presenceElement(By key) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public void isAssertTrue(By actualValue, String exceptedValue)
    {
        String actualText= findElement(actualValue).getText();
        Assert.assertEquals(actualText,exceptedValue);

    }

}