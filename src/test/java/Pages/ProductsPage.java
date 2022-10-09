package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    WebDriver driver;
    Helper elementHelper;

    public ProductsPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }

    By productColor= By.xpath("//h3[contains(text(),'Çorabı Siyah')]");




    public void setBlackColor()
    {
        elementHelper.click(productColor);

    }

}
