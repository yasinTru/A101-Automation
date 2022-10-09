package StepDefinitions;
import Framework.DriverSetup;
import Pages.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    HomePage homePage=new HomePage(DriverSetup.getDriver());

    @Given("I am in A101 home page")
    public void homePageProcess()
    {
        homePage.acceptCookie();
        homePage.clickDressTitle();
    }
}
