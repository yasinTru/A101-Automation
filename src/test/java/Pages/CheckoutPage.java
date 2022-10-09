package Pages;
import Framework.Helper;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver driver;
    Helper elementHelper;

    public CheckoutPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }

    By continueInvalidBtn= By.partialLinkText("ÜYE OLMADAN DEVAM ET");

    public void setContinueInvalidBtn()
    {
        elementHelper.click(continueInvalidBtn);
    }
}
