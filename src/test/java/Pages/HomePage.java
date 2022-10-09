package Pages;

import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class HomePage {

    WebDriver driver;
    Helper elementHelper;


    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);


    }

    By homePopUp= By.className("closePopupPersona");
    By homeCoockie= By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By kneeSocksButton= By.xpath("//a[contains(text(),'Dizalt')]");


   /* public void closePopUp()
    {
       elementHelper.click(homePopUp);
    }

*/

    public void acceptCookie()
    {
        elementHelper.click(homeCoockie);
    }

    public void clickDressTitle()
    {
        Actions actions= new Actions(driver);
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        WebElement dressCatogoryTitle= driver.findElement(By.xpath("//a[normalize-space()='Giyim & aksesuar']"));
        actions.moveToElement(dressCatogoryTitle ).perform();
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBB");
        //actions.moveToElement((WebElement) dressNavBar).perform();
        elementHelper.click(kneeSocksButton);


    }



}
