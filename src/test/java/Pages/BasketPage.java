package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasketPage {

    WebDriver driver;
    Helper elementHelper;

    public BasketPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }

    By confirmBasketBtn= By.cssSelector(".button.green.checkout-button");

    public void confirmBasket()
    {
        elementHelper.click(confirmBasketBtn);
    }
}
