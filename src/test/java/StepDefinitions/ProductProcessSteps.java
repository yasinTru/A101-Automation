package StepDefinitions;

import Framework.DriverSetup;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProductProcessSteps {

    ProductPage productPage=new ProductPage(DriverSetup.getDriver());
    ProductsPage productsPage= new ProductsPage(DriverSetup.getDriver());

    @When("I want to buy kneeSock product")
    public void ProductsPageProcess()
    {
        productsPage.setBlackColor();

    }

    @And("Product color should be Black")
    public void ProductPageProcess()
    {
        productPage.addBasket();
        productPage.goToBasketFromProduct();

    }


}
