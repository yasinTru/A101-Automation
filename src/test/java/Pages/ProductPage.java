package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver driver;
    Helper elementHelper;

    public ProductPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }

    By addToBasketBtn= By.cssSelector(".add-to-basket.button");
    By goToBasketBtn= By.cssSelector(".go-to-shop");

    public void addBasket()
    {
        elementHelper.click(addToBasketBtn);
    }

    public void goToBasketFromProduct()
    {
        elementHelper.click(goToBasketBtn);
    }
}
