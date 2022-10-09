package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import javax.swing.text.AbstractDocument;

public class DeliveryPage {

    WebDriver driver;
    Helper elementHelper;

    public DeliveryPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }

    By createAddressBtn= By.cssSelector(".new-address.js-new-address");
    By addressTitle= By.cssSelector("input[placeholder=\"Ev adresim, iş adresim vb.\"]");
    By nameInput= By.name("first_name");
    By surnameInput= By.name("last_name");
    By phoneInput= By.name("phone_number");
    By addressField= By.className("js-address-textarea");
    By submitBtn= By.cssSelector("button[class='button green js-set-country js-prevent-emoji']");
    By cargoCompany= By.xpath("(//span[normalize-space()='UPS Kargo'])[1]");
    By submitAndContinueBtn= By.cssSelector(".button.block.green.js-proceed-button");

    public void setCreateAddressBtn()
    {
        elementHelper.click(createAddressBtn);

    }

    public void setAddressTitle()
    {
        elementHelper.sendKey(addressTitle,"Evim");
    }

    public void setNameInput()
    {
        elementHelper.sendKey(nameInput,"Yasin");

    }

    public void setSurnameInput()
    {
        elementHelper.sendKey(surnameInput,"Dogru");

    }

    public void setPhoneInput()
    {
        elementHelper.sendKey(phoneInput,"05666666666");
    }

    public void setCityDropdown()
    {
        Select drpCity= new Select(driver.findElement(By.name("city")));
        drpCity.selectByVisibleText("ANTALYA");
    }

    public void setTownshipDropdown()
    {
        Select drpTownship= new Select(driver.findElement(By.name("township")));
        drpTownship.selectByVisibleText("ALANYA");
    }

    public void setDistrictDropdown() throws InterruptedException
    {
        By districtTxt= By.cssSelector("select[name='district']");
        By optionTxt= By.cssSelector("option[value='6663']");
        elementHelper.click(districtTxt);
        Thread.sleep(1000);
        elementHelper.click(optionTxt);
        //Select drpDistrict= new Select(driver.findElement(By.className("js-district")));
        //drpDistrict.selectByVisibleText("ALARA MAH");
    }

    public void setAddressField()
    {
        elementHelper.sendKey(addressField,"Su Mahallesi,Yol Sokak,No:15");
    }

    public void setSubmitBtn()
    {
        elementHelper.click(submitBtn);
    }

    public void setCargoCompany()
    {
        elementHelper.click(cargoCompany);
    }

    public void setSubmitAndContinue()
    {
        elementHelper.click(submitAndContinueBtn);

    }





}
