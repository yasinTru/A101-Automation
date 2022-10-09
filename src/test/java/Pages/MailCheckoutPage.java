package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailCheckoutPage {

    WebDriver driver;
    Helper elementHelper;

    public MailCheckoutPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }

    By emailInput= By.name("user_email");
    By continueBtn= By.cssSelector("button[class='button block green']");

    public void setEmailInput()
    {
        elementHelper.sendKey(emailInput,"test@gmail.com");

    }

    public void setContinueBtn()
    {
        elementHelper.click(continueBtn);

    }
}
