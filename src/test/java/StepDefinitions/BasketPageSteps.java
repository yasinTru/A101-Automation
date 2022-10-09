package StepDefinitions;
import Framework.DriverSetup;
import Pages.BasketPage;
import Pages.CheckoutPage;
import io.cucumber.java.en.Then;

public class BasketPageSteps {

    BasketPage basketPage= new BasketPage(DriverSetup.getDriver());
    CheckoutPage checkoutPage=new CheckoutPage(DriverSetup.getDriver());

    @Then("I should be able see product in basket")
    public void BasketPageProcess()
    {
        basketPage.confirmBasket();
        checkoutPage.setContinueInvalidBtn();
    }

}
