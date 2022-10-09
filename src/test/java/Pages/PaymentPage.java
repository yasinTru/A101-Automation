package Pages;
import Framework.Helper;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {

    WebDriver driver;
    Helper elementHelper;

    public PaymentPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }

    By nameSurnameInput= By.xpath("(//input[@name='name'])[2]");
    By cardNumberInput= By.cssSelector(".js-masterpassbin-payment-card");
    By cvcInput= By.cssSelector("div[class='form-area js-new-creditcard-area'] input[name='card_cvv']");
    By completeOrderBtn= By.className("order-complete");
    By agrementLabel= By.cssSelector("label[for='agrement2']");

    public void setNameSurnameInput()
    {
        elementHelper.sendKey(nameSurnameInput,"Yasin Dogru");
    }

    public void setCardNumberInput()
    {
        elementHelper.sendKey(cardNumberInput,"1234432112344321");
    }

    public void setExpirationMonth() throws InterruptedException
    {
        By expirationMonth= By.cssSelector("div[class='form-area js-new-creditcard-area'] select[name='card_month']");
        By expirationValue= By.cssSelector("select[autocomplete='off'] option[value='4']");
        elementHelper.click(expirationMonth);
        Thread.sleep(2000);
        elementHelper.click(expirationValue);

        //Select drpMonth = new Select(driver.findElement(By.cssSelector(".select.select--first .js-payment-month")));

        //drpMonth.selectByVisibleText("7");
    }

    public void setExpirationYear() throws InterruptedException
    {
        By expirationYear= By.cssSelector("div[class='form-area js-new-creditcard-area'] select[name='card_year']");
        By expirationYearValue= By.cssSelector("select[autocomplete='off'] option[value='2023']");
        elementHelper.click(expirationYear);
        Thread.sleep(2000);
        elementHelper.click(expirationYearValue);
        // Select drpYear = new Select(driver.findElement(By.name("card_year")));
        // drpYear.selectByVisibleText("2023");
    }

    public void setCvcInput()
    {
        elementHelper.sendKey(cvcInput,"123");
    }

    public void setAgrement()
    {
        elementHelper.click(agrementLabel);
    }

    public void setCompleteOrderBtn()
    {
        elementHelper.click(completeOrderBtn);
    }




}
